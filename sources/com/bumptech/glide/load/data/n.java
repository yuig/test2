package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import wd.y;

/* loaded from: classes.dex */
public final class n implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29817a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f29818b;

    public n(InputStream inputStream, qd.i iVar) {
        y yVar = new y(inputStream, iVar);
        this.f29818b = yVar;
        yVar.mark(5242880);
    }

    public final ParcelFileDescriptor a() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f29818b).rewind();
    }

    @Override // com.bumptech.glide.load.data.g
    public final void b() {
        switch (this.f29817a) {
            case 0:
                break;
            default:
                ((y) this.f29818b).c();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.g
    public final Object c() {
        switch (this.f29817a) {
            case 0:
                return a();
            default:
                y yVar = (y) this.f29818b;
                yVar.reset();
                return yVar;
        }
    }

    public n(ParcelFileDescriptor parcelFileDescriptor) {
        this.f29818b = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }
}
