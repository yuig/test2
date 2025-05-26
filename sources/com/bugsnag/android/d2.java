package com.bugsnag.android;

import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class d2 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29188a;

    public /* synthetic */ d2(int i13) {
        this.f29188a = i13;
    }

    public final String toString() {
        switch (this.f29188a) {
            case 1:
                return "ByteStreams.nullOutputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i13) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.f29188a) {
            case 1:
                bArr.getClass();
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i13, int i14) {
        switch (this.f29188a) {
            case 1:
                bArr.getClass();
                bf.b.r(i13, i14 + i13, bArr.length);
                break;
            default:
                super.write(bArr, i13, i14);
                break;
        }
    }
}
