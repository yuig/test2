package qv0;

import android.content.Context;
import com.pinterest.navigation.Navigation;
import h32.d4;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105185i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f105186j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i13) {
        super(0);
        this.f105185i = i13;
        this.f105186j = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f105185i;
        j jVar = this.f105186j;
        switch (i13) {
            case 0:
                f0 b73 = jVar.b7();
                ag1.h hVar = jVar.B0;
                if (hVar == null) {
                    Intrinsics.r("ideaPinSessionDataManager");
                    throw null;
                }
                d4 d4Var = d4.STORY_PIN_STICKER_BY_CATEGORY_PICKER;
                Navigation navigation = jVar.I;
                String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null;
                Navigation navigation2 = jVar.I;
                return new du0.b(b73, hVar, d4Var, v03, navigation2 != null ? navigation2.S("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", false) : false);
            default:
                Context requireContext = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                ag1.b bVar = jVar.A0;
                if (bVar != null) {
                    return new r(requireContext, (com.bumptech.glide.l) bVar.f15139l.getValue());
                }
                Intrinsics.r("dataManager");
                throw null;
        }
    }
}
