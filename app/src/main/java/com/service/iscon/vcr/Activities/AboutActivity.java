package com.service.iscon.vcr.Activities;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.widget.EditText;
import android.widget.TextView;


import com.service.iscon.vcr.R;

import java.util.List;

public class AboutActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
       // EditText ed_chant;
        TextView txt_chant;

       // String text = "LargeText";


    }
}

/*
        implements OnPageChangeListener,OnLoadCompleteListener {
    private static final String TAG = AboutActivity.class.getSimpleName();
    public static final String SAMPLE_FILE = "chant.pdf";
    PDFView pdfView;
    Integer pageNumber = 0;
    String pdfFileName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        pdfView= (PDFView)findViewById(R.id.pdfView);
        displayFromAsset(SAMPLE_FILE);
    }

    private void displayFromAsset(String assetFileName) {
        pdfFileName = assetFileName;

        pdfView.fromAsset(SAMPLE_FILE)
                .defaultPage(pageNumber)
                .enableSwipe(true)

                .swipeHorizontal(false)
                .onPageChange(this)
                .enableAnnotationRendering(true)
                .onLoad(this)
                .scrollHandle(new DefaultScrollHandle(this))
                .load();
    }


    @Override
    public void onPageChanged(int page, int pageCount) {
        pageNumber = page;
        setTitle(String.format("%s %s / %s", pdfFileName, page + 1, pageCount));
    }


    @Override
    public void loadComplete(int nbPages) {
        PdfDocument.Meta meta = pdfView.getDocumentMeta();
        printBookmarksTree(pdfView.getTableOfContents(), "-");

    }

    public void printBookmarksTree(List<PdfDocument.Bookmark> tree, String sep) {
        for (PdfDocument.Bookmark b : tree) {

            Log.e(TAG, String.format("%s %s, p %d", sep, b.getTitle(), b.getPageIdx()));

            if (b.hasChildren()) {
                printBookmarksTree(b.getChildren(), sep + "-");
            }
        }
    }

}


*/
