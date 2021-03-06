package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.PreviewFormats}.  Implements {@link Parcelable}
 */
public class PreviewFormats extends com.percolate.sdk.dto.PreviewFormats implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public PreviewFormats() {
    }

    protected PreviewFormats(Parcel in) {
        this.meta = (com.percolate.sdk.dto.V5Meta) in.readSerializable();
        this.data = new ArrayList<>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<PreviewFormats> CREATOR = new Creator<PreviewFormats>() {
        @Override
        public PreviewFormats createFromParcel(Parcel source) {
            return new PreviewFormats(source);
        }

        @Override
        public PreviewFormats[] newArray(int size) {
            return new PreviewFormats[size];
        }
    };
}
