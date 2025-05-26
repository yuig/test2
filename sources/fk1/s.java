package fk1;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ni1.e0;
import u50.b0;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62368i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ej1.d f62369j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(ej1.d dVar, int i13) {
        super(1);
        this.f62368i = i13;
        this.f62369j = dVar;
    }

    public final d b(d state) {
        switch (this.f62368i) {
            case 0:
                Intrinsics.checkNotNullParameter(state, "state");
                return d.e(CollectionsKt.m0(new ak1.b(new b0(e0.f90645d), null), CollectionsKt.m0(this.f62369j, state.f62348a)));
            default:
                Intrinsics.checkNotNullParameter(state, "it");
                List list = state.f62348a;
                rm1.q qVar = rm1.q.ARROW_SMALL_UP_RIGHT;
                rm1.c cVar = rm1.c.DEFAULT;
                rm1.i iVar = rm1.i.XS;
                int i13 = wy1.b.d2s_metadata_icon_padding;
                g92.d dVar = g92.d.VR;
                return d.e(CollectionsKt.m0(new ak1.b(new b0(e0.f90645d), "possiblyAddMetadataCtaPiece - GRID_CELL_INNER_PADDING_RES"), CollectionsKt.m0(new fj1.c(this.f62369j, null, i13, qVar, cVar, iVar, fj1.a.START, dVar, 2), list)));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f62368i) {
        }
        return b((d) obj);
    }
}
