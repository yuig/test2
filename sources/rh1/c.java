package rh1;

import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108123a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, int i13) {
        super(1, kVar, k.class, "onSelectSortItem", "onSelectSortItem(I)V", 0);
        this.f108123a = i13;
        if (i13 == 1) {
            super(1, kVar, k.class, "onClickUser", "onClickUser(Ljava/lang/String;)V", 0);
            return;
        }
        if (i13 == 2) {
            super(1, kVar, k.class, "onClickAttachedPin", "onClickAttachedPin(Ljava/lang/String;)V", 0);
        } else if (i13 != 3) {
        } else {
            super(1, kVar, k.class, "translationLookup", "translationLookup(Ljava/lang/String;)Ljava/lang/String;", 0);
        }
    }

    public final void h(String p03) {
        switch (this.f108123a) {
            case 1:
                Intrinsics.checkNotNullParameter(p03, "p0");
                com.pinterest.feature.unifiedcomments.c cVar = ((k) this.receiver).Z0;
                if (cVar != null) {
                    ((oh1.m) cVar).M3(p03);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(p03, "p0");
                com.pinterest.feature.unifiedcomments.c cVar2 = ((k) this.receiver).Z0;
                if (cVar2 != null) {
                    ((oh1.m) cVar2).L3(p03);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f108123a) {
            case 0:
                int intValue = ((Number) obj).intValue();
                k kVar = (k) this.receiver;
                Number number = (Number) kVar.f108198d1.get(intValue);
                int intValue2 = number.intValue();
                GestaltText gestaltText = kVar.K0;
                if (gestaltText == null) {
                    Intrinsics.r("commentSortLabel");
                    throw null;
                }
                pk.a0.p(gestaltText, kVar.getString(ob2.f.comments_sort_by) + kVar.getString(intValue2));
                com.pinterest.feature.unifiedcomments.c cVar = kVar.Z0;
                if (cVar != null) {
                    ((oh1.m) cVar).S3(intValue2);
                }
                kVar.f108197c1 = number.intValue();
                a.c.y(kVar.f7());
                return Unit.f80348a;
            case 1:
                h((String) obj);
                return Unit.f80348a;
            case 2:
                h((String) obj);
                return Unit.f80348a;
            default:
                String p03 = (String) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                com.pinterest.feature.unifiedcomments.c cVar2 = ((k) this.receiver).Z0;
                if (cVar2 != null) {
                    return ((oh1.m) cVar2).d4(p03);
                }
                return null;
        }
    }
}
