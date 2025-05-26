package o7;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import d7.n0;
import java.util.Objects;
import pk.c1;
import pk.h1;
import pk.v2;
import pk.x0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f93019c = new b(c1.v(a.f93014d));

    /* renamed from: d, reason: collision with root package name */
    public static final v2 f93020d = c1.x(2, 5, 6);

    /* renamed from: e, reason: collision with root package name */
    public static final h1 f93021e;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f93022a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final int f93023b;

    static {
        d7.b0 b0Var = new d7.b0(2, 0);
        b0Var.e(5, 6);
        b0Var.e(17, 6);
        b0Var.e(7, 6);
        b0Var.e(30, 10);
        b0Var.e(18, 6);
        b0Var.e(6, 8);
        b0Var.e(8, 8);
        b0Var.e(14, 8);
        f93021e = b0Var.a();
    }

    public b(v2 v2Var) {
        for (int i13 = 0; i13 < v2Var.f100504d; i13++) {
            a aVar = (a) v2Var.get(i13);
            this.f93022a.put(aVar.f93015a, aVar);
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f93022a.size(); i15++) {
            i14 = Math.max(i14, ((a) this.f93022a.valueAt(i15)).f93016b);
        }
        this.f93023b = i14;
    }

    public static v2 a(int[] iArr, int i13) {
        x0 n13 = c1.n();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i14 : iArr) {
            n13.e(new a(i14, i13));
        }
        return n13.i();
    }

    public static b b(Context context, a7.f fVar, h1.b bVar) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar, bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x023e, code lost:
    
        if (r6.equals("Xiaomi") == false) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o7.b c(android.content.Context r15, android.content.Intent r16, a7.f r17, h1.b r18) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.b.c(android.content.Context, android.content.Intent, a7.f, h1.b):o7.b");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
    
        if (r11 != 5) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0085, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair d(a7.f r13, androidx.media3.common.b r14) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.b.d(a7.f, androidx.media3.common.b):android.util.Pair");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0024, code lost:
    
        if (r1 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof o7.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            o7.b r9 = (o7.b) r9
            android.util.SparseArray r1 = r8.f93022a
            android.util.SparseArray r3 = r9.f93022a
            int r4 = d7.n0.f53866a
            if (r1 != 0) goto L17
            if (r3 != 0) goto L52
            goto L4b
        L17:
            if (r3 != 0) goto L1a
            goto L52
        L1a:
            int r4 = d7.n0.f53866a
            r5 = 31
            if (r4 < r5) goto L27
            boolean r1 = d7.l0.q(r1, r3)
            if (r1 == 0) goto L52
            goto L4b
        L27:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L32
            goto L52
        L32:
            r5 = r2
        L33:
            if (r5 >= r4) goto L4b
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 != 0) goto L48
            goto L52
        L48:
            int r5 = r5 + 1
            goto L33
        L4b:
            int r1 = r8.f93023b
            int r9 = r9.f93023b
            if (r1 != r9) goto L52
            goto L53
        L52:
            r0 = r2
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i13;
        SparseArray sparseArray = this.f93022a;
        if (n0.f53866a >= 31) {
            i13 = sparseArray.contentHashCode();
        } else {
            int i14 = 17;
            for (int i15 = 0; i15 < sparseArray.size(); i15++) {
                i14 = Objects.hashCode(sparseArray.valueAt(i15)) + ((sparseArray.keyAt(i15) + (i14 * 31)) * 31);
            }
            i13 = i14;
        }
        return (i13 * 31) + this.f93023b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f93023b + ", audioProfiles=" + this.f93022a + "]";
    }
}
