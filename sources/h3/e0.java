package h3;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.y3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e0 extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public final c f66638b;

    /* renamed from: c, reason: collision with root package name */
    public String f66639c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f66640d;

    /* renamed from: e, reason: collision with root package name */
    public final a f66641e;

    /* renamed from: f, reason: collision with root package name */
    public Function0 f66642f;

    /* renamed from: g, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f66643g;

    /* renamed from: h, reason: collision with root package name */
    public b3.p f66644h;

    /* renamed from: i, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f66645i;

    /* renamed from: j, reason: collision with root package name */
    public long f66646j;

    /* renamed from: k, reason: collision with root package name */
    public float f66647k;

    /* renamed from: l, reason: collision with root package name */
    public float f66648l;

    /* renamed from: m, reason: collision with root package name */
    public final d0 f66649m;

    public e0(c cVar) {
        this.f66638b = cVar;
        cVar.f66603i = new d0(this, 0);
        this.f66639c = "";
        this.f66640d = true;
        this.f66641e = new a();
        this.f66642f = g.f66665k;
        y3 y3Var = y3.f71400a;
        this.f66643g = bs1.c.u1(null, y3Var);
        this.f66645i = bs1.c.u1(new a3.f(0L), y3Var);
        this.f66646j = y2.h.f136670b;
        this.f66647k = 1.0f;
        this.f66648l = 1.0f;
        this.f66649m = new d0(this, 1);
    }

    @Override // h3.c0
    public final void a(d3.h hVar) {
        e(hVar, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(d3.h r29, float r30, b3.p r31) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.e0.e(d3.h, float, b3.p):void");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Params: \tname: ");
        sb3.append(this.f66639c);
        sb3.append("\n\tviewportWidth: ");
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f66645i;
        sb3.append(a3.f.d(((a3.f) parcelableSnapshotMutableState.getValue()).f497a));
        sb3.append("\n\tviewportHeight: ");
        sb3.append(a3.f.b(((a3.f) parcelableSnapshotMutableState.getValue()).f497a));
        sb3.append("\n");
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }
}
