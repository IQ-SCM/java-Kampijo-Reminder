package com.example.kyle.reminder;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by kyle on 10/06/17.
 */

public final class reminderContract {
    /**
     * The authority of the lentitems provider.
     */
    public static final String AUTHORITY =
            "com.example.kyle.reminder";
    /**
     * The content URI for the top-level
     * lentitems authority.
     */
    public static final Uri BASE_CONTENT_URI =
            Uri.parse("content://" + AUTHORITY);

    public static final String PATH_NOTE = "notes";
    public static final String PATH_NOTE_ID = "notes/#";
    public static final String PATH_ALERT = "alerts";
    public static final String PATH_ALERT_ID = "alerts/#";

    public static final class Notes implements BaseColumns {
        public static final String TABLE_NAME = "reminders";

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_NOTE).build();

        // Custom MIME types
        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE +
                        "/" + AUTHORITY + "/" + PATH_NOTE;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE +
                        "/" + AUTHORITY + "/" + PATH_NOTE;
    }

    public static final class Alerts implements BaseColumns {
        public static final String TABLE_NAME = "reminders";

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_ALERT).build();

        // Custom MIME types
        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE +
                        "/" + AUTHORITY + "/" + PATH_ALERT;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE +
                        "/" + AUTHORITY + "/" + PATH_ALERT;

    }
}