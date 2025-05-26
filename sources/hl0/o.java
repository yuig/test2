package hl0;

import kotlin.Unit;
import wt1.c0;
import wt1.y;

/* loaded from: classes5.dex */
public final class o implements do2.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f69490b;

    public /* synthetic */ o(v vVar, int i13) {
        this.f69489a = i13;
        this.f69490b = vVar;
    }

    public final Object a(c0 c0Var) {
        int i13 = this.f69489a;
        v vVar = this.f69490b;
        switch (i13) {
            case 0:
                if ((c0Var instanceof y) && vVar.f69525i) {
                    gb2.f fVar = gb2.f.f64747a;
                    gb2.f.c(new gb2.h(vVar.f69509a));
                }
                break;
            default:
                if (c0Var instanceof wt1.p) {
                    vVar.u4();
                }
                break;
        }
        return Unit.f80348a;
    }

    @Override // do2.j
    public final /* bridge */ /* synthetic */ Object emit(Object obj, bl2.c cVar) {
        switch (this.f69489a) {
        }
        return a((c0) obj);
    }
}
