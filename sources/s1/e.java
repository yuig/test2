package s1;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.y3;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class e extends o0 {
    public static final d0.o H = new d0.o(22, 0);
    public static final r2.s I = kh2.j.s2(b.f110368i, d.f110375j);
    public final ParcelableSnapshotMutableState G;

    public e(int i13, float f13, Function0 function0) {
        super(i13, f13);
        this.G = bs1.c.u1(function0, y3.f71400a);
    }

    @Override // s1.o0
    public final int n() {
        return ((Number) ((Function0) this.G.getValue()).invoke()).intValue();
    }
}
