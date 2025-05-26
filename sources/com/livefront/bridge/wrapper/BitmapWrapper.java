package com.livefront.bridge.wrapper;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
class BitmapWrapper implements Parcelable {
    public static final Parcelable.Creator<BitmapWrapper> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public Bitmap f34146a;

    public BitmapWrapper(Bitmap bitmap) {
        this.f34146a = bitmap;
    }

    public final Bitmap a() {
        return this.f34146a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        Bitmap bitmap = this.f34146a;
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getAllocationByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        parcel.writeInt(bitmap.getWidth());
        parcel.writeInt(bitmap.getHeight());
        parcel.writeInt(bitmap.getConfig().ordinal());
        parcel.writeByteArray(allocate.array());
    }
}
