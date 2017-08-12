package com.service.iscon.vcr.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.service.iscon.vcr.Model.SessionModel;
import com.service.iscon.vcr.R;

import java.util.List;

/**
 * Created by priyanka on 25-03-2017.
 */

public class SessionHistoryAdapter  extends RecyclerView.Adapter<SessionHistoryAdapter.MyViewHolder> {

    private List<SessionModel> SessionList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
        }
    }


    public SessionHistoryAdapter(List<SessionModel> sList) {
        this.SessionList = sList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_session_history, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        SessionModel sessionModel = SessionList.get(position);
        holder.title.setText("Date \n"+sessionModel.getDateInIST());
        holder.title.setText("Date \n"+sessionModel.getDateInISTFormat2());
//        holder.genre.setText(sessionModel.getStartTimeInIST());
        holder.year.setText("Total Beads \n"+String.valueOf(sessionModel.getBeads()));
    }

    @Override
    public int getItemCount() {
        return SessionList.size();
    }
}