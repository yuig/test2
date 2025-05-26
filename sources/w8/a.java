package w8;

import a7.o0;
import a7.q;
import androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException;
import c0.s0;
import d7.c0;
import d7.d0;
import java.util.Collections;
import q8.k0;

/* loaded from: classes3.dex */
public final class a extends s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f128215e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    public boolean f128216b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f128217c;

    /* renamed from: d, reason: collision with root package name */
    public int f128218d;

    public final boolean q(d0 d0Var) {
        if (this.f128216b) {
            d0Var.L(1);
        } else {
            int y13 = d0Var.y();
            int i13 = (y13 >> 4) & 15;
            this.f128218d = i13;
            if (i13 == 2) {
                int i14 = f128215e[(y13 >> 2) & 3];
                q qVar = new q();
                qVar.f1180m = o0.r("video/x-flv");
                qVar.f1181n = o0.r("audio/mpeg");
                qVar.D = 1;
                qVar.E = i14;
                ((k0) this.f24333a).b(qVar.a());
                this.f128217c = true;
            } else if (i13 == 7 || i13 == 8) {
                String str = i13 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                q qVar2 = new q();
                qVar2.f1180m = o0.r("video/x-flv");
                qVar2.f1181n = o0.r(str);
                qVar2.D = 1;
                qVar2.E = 8000;
                ((k0) this.f24333a).b(qVar2.a());
                this.f128217c = true;
            } else if (i13 != 10) {
                throw new TagPayloadReader$UnsupportedFormatException("Audio format not supported: " + this.f128218d);
            }
            this.f128216b = true;
        }
        return true;
    }

    public final boolean r(long j13, d0 d0Var) {
        if (this.f128218d == 2) {
            int a13 = d0Var.a();
            ((k0) this.f24333a).d(a13, 0, d0Var);
            ((k0) this.f24333a).a(j13, 1, a13, 0, null);
            return true;
        }
        int y13 = d0Var.y();
        if (y13 != 0 || this.f128217c) {
            if (this.f128218d == 10 && y13 != 1) {
                return false;
            }
            int a14 = d0Var.a();
            ((k0) this.f24333a).d(a14, 0, d0Var);
            ((k0) this.f24333a).a(j13, 1, a14, 0, null);
            return true;
        }
        int a15 = d0Var.a();
        byte[] bArr = new byte[a15];
        d0Var.i(bArr, 0, a15);
        q8.a j14 = q8.b.j(new c0(bArr, 0, 0), false);
        q qVar = new q();
        qVar.f1180m = o0.r("video/x-flv");
        qVar.f1181n = o0.r("audio/mp4a-latm");
        qVar.f1177j = j14.f102846c;
        qVar.D = j14.f102845b;
        qVar.E = j14.f102844a;
        qVar.f1184q = Collections.singletonList(bArr);
        ((k0) this.f24333a).b(new androidx.media3.common.b(qVar));
        this.f128217c = true;
        return false;
    }
}
