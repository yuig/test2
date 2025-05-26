package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes3.dex */
class NamespaceRemovingInputStream extends SdkFilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f29045a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f29046b;

    public static final class StringPrefixSlicer {

        /* renamed from: a, reason: collision with root package name */
        public String f29047a;

        public final boolean a(String str) {
            if (!this.f29047a.startsWith(str)) {
                return false;
            }
            this.f29047a = this.f29047a.substring(str.length());
            return true;
        }

        public final void b() {
            if (this.f29047a.startsWith(" ")) {
                while (this.f29047a.startsWith(" ")) {
                    this.f29047a = this.f29047a.substring(1);
                }
            }
        }
    }

    public NamespaceRemovingInputStream(ByteArrayInputStream byteArrayInputStream) {
        super(new BufferedInputStream(byteArrayInputStream));
        this.f29045a = new byte[200];
        this.f29046b = false;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int indexOf;
        d();
        int read = ((FilterInputStream) this).in.read();
        if (read != 120 || this.f29046b) {
            return read;
        }
        this.f29045a[0] = (byte) read;
        ((FilterInputStream) this).in.mark(this.f29045a.length);
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = this.f29045a;
        int read2 = inputStream.read(bArr, 1, bArr.length - 1);
        ((FilterInputStream) this).in.reset();
        String str = new String(this.f29045a, 0, read2 + 1, StringUtils.f29048a);
        StringPrefixSlicer stringPrefixSlicer = new StringPrefixSlicer();
        stringPrefixSlicer.f29047a = str;
        int i13 = -1;
        if (stringPrefixSlicer.a("xmlns")) {
            stringPrefixSlicer.b();
            if (stringPrefixSlicer.a("=")) {
                stringPrefixSlicer.b();
                if (stringPrefixSlicer.a("\"") && (indexOf = stringPrefixSlicer.f29047a.indexOf("\"")) >= 0) {
                    stringPrefixSlicer.f29047a = stringPrefixSlicer.f29047a.substring(indexOf + 1);
                    i13 = str.length() - stringPrefixSlicer.f29047a.length();
                }
            }
        }
        if (i13 <= 0) {
            return read;
        }
        for (int i14 = 0; i14 < i13 - 1; i14++) {
            ((FilterInputStream) this).in.read();
        }
        int read3 = ((FilterInputStream) this).in.read();
        this.f29046b = true;
        return read3;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        for (int i15 = 0; i15 < i14; i15++) {
            int read = read();
            if (read == -1) {
                if (i15 == 0) {
                    return -1;
                }
                return i15;
            }
            bArr[i15 + i13] = (byte) read;
        }
        return i14;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
