package ca0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27174i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f27175j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(u uVar, int i13) {
        super(1);
        this.f27174i = i13;
        this.f27175j = uVar;
    }

    public final d b(d it) {
        int i13 = this.f27174i;
        u uVar = this.f27175j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(it, null, null, null, null, null, false, ((g) uVar).f27113a, false, null, 3583);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                i iVar = (i) uVar;
                return d.e(it, iVar.f27125b, iVar.f27126c, null, null, null, false, null, false, null, 4089);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(it, null, null, ((t) uVar).f27163a, null, null, false, null, false, null, 4087);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(it, null, null, null, ((j) uVar).f27131a, null, false, null, false, null, 4079);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(it, null, null, null, null, ((e) uVar).f27095a, false, null, false, null, 4063);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(it, null, null, null, null, null, ((k) uVar).f27134a, null, false, null, 4031);
        }
    }

    public final a1 e(a1 it) {
        int i13 = this.f27174i;
        u uVar = this.f27175j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return a1.b(it, ((i) uVar).f27124a, null, null, null, null, false, null, null, RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return a1.b(it, null, null, null, null, ((m) uVar).f27143a, false, null, null, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return a1.b(it, null, ((t) uVar).f27163a, null, null, null, false, null, null, RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER);
            case 5:
            case 7:
            case 9:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return a1.b(it, null, null, null, null, null, false, ((g) uVar).f27113a, null, RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return a1.b(it, null, null, ((j) uVar).f27131a, null, null, false, null, null, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return a1.b(it, null, null, null, ((e) uVar).f27095a, null, false, null, null, RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER);
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return a1.b(it, null, null, null, null, null, ((k) uVar).f27134a, null, null, RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f27174i) {
            case 0:
                return b((d) obj);
            case 1:
                return b((d) obj);
            case 2:
                return e((a1) obj);
            case 3:
                return e((a1) obj);
            case 4:
                return e((a1) obj);
            case 5:
                return b((d) obj);
            case 6:
                return e((a1) obj);
            case 7:
                return b((d) obj);
            case 8:
                return e((a1) obj);
            case 9:
                return b((d) obj);
            case 10:
                return e((a1) obj);
            case 11:
                return b((d) obj);
            default:
                return e((a1) obj);
        }
    }
}
