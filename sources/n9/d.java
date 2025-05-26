package n9;

import com.github.mikephil.charting.data.Entry;
import java.lang.reflect.Array;
import java.util.List;
import l0.k;
import oe2.c0;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f89951a;

    /* renamed from: b, reason: collision with root package name */
    public int f89952b;

    /* renamed from: c, reason: collision with root package name */
    public int f89953c;

    /* renamed from: d, reason: collision with root package name */
    public Object f89954d;

    public final void a(c0 c0Var) {
        c0Var.f94295c = null;
        c0Var.f94293a = null;
        c0Var.f94294b = null;
        c0Var.f94301i = 1;
        int i13 = this.f89951a;
        if (i13 > 0) {
            int i14 = this.f89953c;
            if ((i14 & 1) == 0) {
                this.f89953c = i14 + 1;
                this.f89951a = i13 - 1;
                this.f89952b++;
            }
        }
        c0Var.f94293a = (c0) this.f89954d;
        this.f89954d = c0Var;
        int i15 = this.f89953c;
        int i16 = i15 + 1;
        this.f89953c = i16;
        int i17 = this.f89951a;
        if (i17 > 0 && (i16 & 1) == 0) {
            this.f89953c = i15 + 2;
            this.f89951a = i17 - 1;
            this.f89952b++;
        }
        int i18 = 4;
        while (true) {
            int i19 = i18 - 1;
            if ((this.f89953c & i19) != i19) {
                return;
            }
            int i23 = this.f89952b;
            if (i23 == 0) {
                c0 c0Var2 = (c0) this.f89954d;
                c0 c0Var3 = c0Var2.f94293a;
                c0 c0Var4 = c0Var3.f94293a;
                c0Var3.f94293a = c0Var4.f94293a;
                this.f89954d = c0Var3;
                c0Var3.f94294b = c0Var4;
                c0Var3.f94295c = c0Var2;
                c0Var3.f94301i = c0Var2.f94301i + 1;
                c0Var4.f94293a = c0Var3;
                c0Var2.f94293a = c0Var3;
            } else if (i23 == 1) {
                c0 c0Var5 = (c0) this.f89954d;
                c0 c0Var6 = c0Var5.f94293a;
                this.f89954d = c0Var6;
                c0Var6.f94295c = c0Var5;
                c0Var6.f94301i = c0Var5.f94301i + 1;
                c0Var5.f94293a = c0Var6;
                this.f89952b = 0;
            } else if (i23 == 2) {
                this.f89952b = 0;
            }
            i18 *= 2;
        }
    }

    public final k b() {
        return ((k[]) this.f89954d)[this.f89951a];
    }

    public final byte[][] c(int i13, int i14) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f89952b * i14, this.f89953c * i13);
        int i15 = this.f89952b * i14;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = (i15 - i16) - 1;
            k kVar = ((k[]) this.f89954d)[i16 / i14];
            int length = ((byte[]) kVar.f81236c).length * i13;
            byte[] bArr2 = new byte[length];
            for (int i18 = 0; i18 < length; i18++) {
                bArr2[i18] = ((byte[]) kVar.f81236c)[i18 / i13];
            }
            bArr[i17] = bArr2;
        }
        return bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(wf.b bVar, xf.a aVar) {
        ((zf.c) this.f89954d).f141832b.getClass();
        float max = Math.max(0.0f, Math.min(1.0f, 1.0f));
        float c13 = bVar.c();
        float d2 = bVar.d();
        tf.e eVar = (tf.e) aVar;
        Entry f13 = eVar.f(c13, Float.NaN, tf.d.DOWN);
        Entry f14 = eVar.f(d2, Float.NaN, tf.d.UP);
        List list = eVar.f117526o;
        this.f89951a = f13 == null ? 0 : list.indexOf(f13);
        this.f89952b = f14 != null ? list.indexOf(f14) : 0;
        this.f89953c = (int) ((r2 - this.f89951a) * max);
    }
}
