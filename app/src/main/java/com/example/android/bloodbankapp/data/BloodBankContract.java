package com.example.android.bloodbankapp.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by shubham on 17/3/17.
 */

public class BloodBankContract {

    public static final String CONTENT_AUTHORITY = "com.example.android.bloodbankapp.app";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final String PATH_DONOR = "donor";
    public static final String PATH_RECEIVER = "receiver";
    public static final String PATH_DONOR_TRANSACTION = "donor_transaction";
    public static final String PATH_RECEIVER_TRANSACTION = "receiver_transaction";

    public static final class DonorEntry implements BaseColumns {
        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_DONOR).build();

        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_DONOR;
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_DONOR;

        public static final String TABLE_NAME = "donor";

        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_CONTACT_NO = "contact_no";
        public static final String COLUMN_BLOOD_GROUP = "blood_group";

    }

    public static final class ReceiverEntry implements BaseColumns {
        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_RECEIVER).build();

        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_RECEIVER;
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_RECEIVER;

        public static final String TABLE_NAME = "receiver";

        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_CONTACT_NO = "contact_no";
    }

    public static final class DonorTransactionEntry implements BaseColumns {
        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_DONOR_TRANSACTION).build();

        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_DONOR_TRANSACTION;
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_DONOR_TRANSACTION;

        public static final String TABLE_NAME = "donor_transaction";

        public static final String COLUMN_DONOR_KEY = "donor_id";
        public static final String COLUMN_QUANTITY = "quantity";
        public static final String COLUMN_PRICE = "price";
        public static final String COLUMN_TRANSACTION_DATE = "date";
    }

    public static final class ReceiverTransactionEntry implements BaseColumns {
        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_RECEIVER_TRANSACTION).build();

        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_RECEIVER_TRANSACTION;
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_RECEIVER_TRANSACTION;

        public static final String TABLE_NAME = "receiver_transaction";

        public static final String COLUMN_RECEIVER_KEY = "receiver_id";
        public static final String COLUMN_BLOOD_GROUP = "blood_group";
        public static final String COLUMN_QUANTITY = "quantity";
        public static final String COLUMN_PRICE = "price";
        public static final String COLUMN_TRANSACTION_DATE = "date";
    }

}