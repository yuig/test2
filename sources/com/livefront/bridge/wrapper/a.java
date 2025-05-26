package com.livefront.bridge.wrapper;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        BitmapWrapper bitmapWrapper = new BitmapWrapper();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        Bitmap.Config config = Bitmap.Config.values()[parcel.readInt()];
        byte[] createByteArray = parcel.createByteArray();
        Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, config);
        bitmapWrapper.f34146a = createBitmap;
        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(createByteArray));
        return bitmapWrapper;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new BitmapWrapper[i13];
    }
}
