package com.bumptech.glide.load.data;

import a8.q;
import android.os.ParcelFileDescriptor;
import h6.b0;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29803a;

    public /* synthetic */ h(int i13) {
        this.f29803a = i13;
    }

    @Override // com.bumptech.glide.load.data.f
    public final Class a() {
        switch (this.f29803a) {
            case 0:
                throw new UnsupportedOperationException("Not implemented");
            case 1:
                return ParcelFileDescriptor.class;
            default:
                return ByteBuffer.class;
        }
    }

    @Override // com.bumptech.glide.load.data.f
    public final g b(Object obj) {
        switch (this.f29803a) {
            case 0:
                return new q(obj);
            case 1:
                return new n((ParcelFileDescriptor) obj);
            default:
                return new b0((ByteBuffer) obj);
        }
    }
}
