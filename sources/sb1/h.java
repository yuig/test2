package sb1;

import com.pinterest.feature.settings.notifications.y0;
import com.pinterest.feature.settings.shared.view.SettingsToggleItemView;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m60.w;

/* loaded from: classes5.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f112245r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f112246s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f112246s = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        h hVar = new h(this.f112246s, cVar);
        hVar.f112245r = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        of0.a aVar;
        cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        b bVar = (b) this.f112245r;
        l lVar = this.f112246s;
        GestaltText gestaltText = lVar.f112261h0;
        if (gestaltText == null) {
            Intrinsics.r("emailView");
            throw null;
        }
        gestaltText.i(new y0(bVar, 8));
        SettingsToggleItemView settingsToggleItemView = lVar.f112259f0;
        if (settingsToggleItemView == null) {
            Intrinsics.r("toggleItemView");
            throw null;
        }
        s91.l lVar2 = lVar.f112262i0;
        lVar2.f125210e = true;
        lVar2.f112092i = bVar.f112240c;
        settingsToggleItemView.a(lVar2);
        w f73 = lVar.f7();
        boolean z13 = bVar.f112238a;
        if (z13) {
            aVar = new of0.a(new mf0.l());
        } else {
            if (z13) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new of0.a(null);
        }
        f73.d(aVar);
        return Unit.f80348a;
    }
}
