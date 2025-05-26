package wa1;

import android.view.View;
import ao2.j0;
import com.pinterest.feature.settings.shared.view.SettingsEducationOverlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import rg0.n;
import xa1.l;

/* loaded from: classes5.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f128640r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f128641s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f128642t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f128643u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, n nVar, List list, bl2.c cVar) {
        super(2, cVar);
        this.f128641s = kVar;
        this.f128642t = nVar;
        this.f128643u = list;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f128641s, this.f128642t, this.f128643u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f128640r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f128640r = 1;
            if (l0.S(100L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        l lVar = (l) ((com.pinterest.feature.settings.menu.b) this.f128641s.getView());
        lVar.getClass();
        n experience = this.f128642t;
        Intrinsics.checkNotNullParameter(experience, "experience");
        List educationSteps = this.f128643u;
        Intrinsics.checkNotNullParameter(educationSteps, "educationSteps");
        List list = lVar.L0;
        Iterator it = list.iterator();
        List list2 = educationSteps;
        Iterator it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(g0.q(list, 10), g0.q(list2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            eg0.c cVar = (eg0.c) it2.next();
            View findViewById = lVar.requireActivity().findViewById(((Number) next).intValue());
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            String descriptionText = cVar.f58883b;
            Intrinsics.checkNotNullExpressionValue(descriptionText, "descriptionText");
            String completeButtonText = cVar.f58885d;
            Intrinsics.checkNotNullExpressionValue(completeButtonText, "completeButtonText");
            arrayList.add(new yc1.a(findViewById, descriptionText, completeButtonText));
        }
        SettingsEducationOverlay settingsEducationOverlay = lVar.J0;
        if (settingsEducationOverlay != null) {
            settingsEducationOverlay.c(experience, arrayList);
            return Unit.f80348a;
        }
        Intrinsics.r("settingsEducationOverlay");
        throw null;
    }
}
