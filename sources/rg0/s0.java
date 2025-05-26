package rg0;

import com.pinterest.api.model.fr0;
import com.pinterest.api.model.ur0;
import com.pinterest.api.model.vh;
import kh2.j1;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 implements u0 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f108089b;

    /* renamed from: c, reason: collision with root package name */
    public static n f108090c;

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f108088a = new s0();

    /* renamed from: d, reason: collision with root package name */
    public static final xk2.v f108091d = xk2.m.b(u.f108093k);

    public final void a(mz.e answersListener, vh story, cz.e anketManager, Integer num, mz.g gVar) {
        Intrinsics.checkNotNullParameter(answersListener, "anketInlineSurveyView");
        Intrinsics.checkNotNullParameter(story, "story");
        Intrinsics.checkNotNullParameter(anketManager, "anketManager");
        vd0.c pinterestJsonObject = new vd0.c(story.c());
        n experienceValue = new n(new vd0.c(story.f42853k));
        f108090c = experienceValue;
        if (!story.f42866x) {
            experienceValue.g();
            story.f42866x = true;
        }
        anketManager.getClass();
        Intrinsics.checkNotNullParameter(this, "surveyListener");
        Intrinsics.checkNotNullParameter(answersListener, "anketInlineSurveyView");
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "surveyJsonObject");
        Intrinsics.checkNotNullParameter(experienceValue, "experienceValue");
        anketManager.f53459g = this;
        String str = experienceValue.f108064f;
        if (str != null) {
            h32.g0 b13 = lz.a.b(experienceValue.f108066h);
            Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
            vd0.c m13 = pinterestJsonObject.m("data");
            vd0.c m14 = m13 != null ? m13.m("survey") : null;
            Intrinsics.f(m14);
            Object e13 = vd0.c.f125622b.e(m14.f125623a, fr0.class);
            Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.Survey");
            ur0 T1 = m2.T1((fr0) e13, str, gh0.b.N(), b13);
            anketManager.c(T1, "", "");
            answersListener.a(j1.E1(T1));
            answersListener.f88534h = gVar;
            Intrinsics.checkNotNullParameter(answersListener, "answersListener");
            anketManager.f53462j = answersListener;
        }
        anketManager.f53465m = num;
        anketManager.f53466n = gVar != null ? gVar.l0() : null;
    }

    public final void b() {
        f108089b = false;
        n nVar = f108090c;
        if (nVar != null) {
            nVar.c(null, null);
        }
    }

    public final void c() {
        f108089b = false;
        n nVar = f108090c;
        if (nVar != null) {
            nVar.a(null, null);
        }
    }
}
