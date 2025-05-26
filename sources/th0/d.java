package th0;

import android.content.Context;
import com.pinterest.expressSurvey.view.ExpressSurveyView;
import com.pinterest.expressSurvey.view.QuestionViewPager;
import df.j1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jc0.s;
import kk2.h;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m60.u;
import m60.x0;
import rg0.n;
import so.oa;
import uj2.b0;
import uj2.q;
import uk1.e;
import wh0.f;
import wh0.g;
import wh0.j;
import yk1.p;

/* loaded from: classes5.dex */
public final class d extends p {

    /* renamed from: a, reason: collision with root package name */
    public final sh0.a f117637a;

    /* renamed from: b, reason: collision with root package name */
    public final n f117638b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f117639c;

    /* renamed from: d, reason: collision with root package name */
    public final String f117640d;

    /* renamed from: e, reason: collision with root package name */
    public final e20.a f117641e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f117642f;

    /* renamed from: g, reason: collision with root package name */
    public QuestionViewPager f117643g;

    /* renamed from: h, reason: collision with root package name */
    public long f117644h;

    /* renamed from: i, reason: collision with root package name */
    public int f117645i;

    /* renamed from: j, reason: collision with root package name */
    public final a f117646j;

    /* renamed from: k, reason: collision with root package name */
    public final a f117647k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(sh0.a survey, n experience, q networkStateStream, e presenterPinalyticsFactory, HashMap experienceAuxData, String userId, e20.a brandSurveyService) {
        super(((uk1.a) presenterPinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(survey, "survey");
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(experienceAuxData, "experienceAuxData");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(brandSurveyService, "brandSurveyService");
        this.f117637a = survey;
        this.f117638b = experience;
        this.f117639c = experienceAuxData;
        this.f117640d = userId;
        this.f117641e = brandSurveyService;
        this.f117642f = new ArrayList();
        this.f117644h = System.currentTimeMillis();
        this.f117645i = survey.f112916e + 1;
        this.f117646j = new a(this, 0);
        this.f117647k = new a(this, 1);
    }

    public static void p3(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onUnbind();
    }

    public static void r3() {
        Context context = kb0.a.f79058b;
        ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().k(rh0.e.thanks_for_feedback);
        u.f85943a.d(new s(true, 0));
    }

    public static void t3(d dVar, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i13 = 1;
        }
        int size = dVar.f117637a.f112917f.size();
        String string = ((ExpressSurveyView) dVar.getView()).getContext().getString(x0.survey_question_progress_footer);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ((ExpressSurveyView) dVar.getView()).f45055a.setText(j1.Y(string, new Object[]{Integer.valueOf(i13), Integer.valueOf(size)}, null, 6));
    }

    @Override // yk1.b, yk1.m
    public final void bind(yk1.n nVar) {
        ExpressSurveyView view = (ExpressSurveyView) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.bind(view);
        this.f117643g = view.f45057c;
        sh0.a aVar = this.f117637a;
        a aVar2 = null;
        int i13 = 0;
        for (Object obj : aVar.f112917f) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            sh0.c question = (sh0.c) obj;
            if (i13 == aVar.f112917f.size() - 1) {
                aVar2 = this.f117647k;
            }
            int i15 = g.f129908d;
            Context context = ((ExpressSurveyView) getView()).getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            a onNextClickListener = this.f117646j;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(onNextClickListener, "onNextClickListener");
            int i16 = f.f129907a[question.f112929h.ordinal()];
            this.f117642f.add((i16 == 1 || i16 == 2 || i16 == 3) ? new wh0.e(context, question, onNextClickListener, aVar2) : i16 != 4 ? i16 != 5 ? new wh0.c(context, question, onNextClickListener, aVar2) : new j(context, question, onNextClickListener, aVar2) : new wh0.c(context, question, onNextClickListener, aVar2));
            i13 = i14;
        }
        QuestionViewPager questionViewPager = this.f117643g;
        if (questionViewPager == null) {
            Intrinsics.r("questionViewPager");
            throw null;
        }
        questionViewPager.z(new c(this));
        QuestionViewPager questionViewPager2 = this.f117643g;
        if (questionViewPager2 == null) {
            Intrinsics.r("questionViewPager");
            throw null;
        }
        questionViewPager2.b(new b(this, 0));
        t3(this, 0, 3);
        bindPinalytics(view);
        if (!aVar.f112915d) {
            this.f117638b.h(this.f117639c);
        }
        this.f117644h = System.currentTimeMillis();
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        Context context = ((ExpressSurveyView) getView()).getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        no0.a aVar = new no0.a(context, this.f117641e);
        m60.e a13 = m60.d.a();
        sh0.a aVar2 = this.f117637a;
        boolean z13 = aVar2.f112914c;
        n nVar = this.f117638b;
        if (z13) {
            nVar.b(aVar2.b());
        } else {
            nVar.d(aVar2.b());
        }
        Long h03 = StringsKt.h0(this.f117640d);
        String str = aVar2.f112912a;
        Long h04 = str != null ? StringsKt.h0(str) : null;
        t82.a aVar3 = aVar2.f112913b;
        t82.e eVar = t82.e.AD;
        Boolean valueOf = Boolean.valueOf(!aVar2.f112914c);
        HashMap hashMap = new HashMap();
        for (sh0.c cVar : aVar2.f112917f) {
            Long valueOf2 = Long.valueOf(Long.parseLong(cVar.f112922a));
            List list = cVar.f112924c;
            ArrayList arrayList = new ArrayList(g0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(Long.parseLong(((sh0.b) it.next()).f112918a)));
            }
            hashMap.put(valueOf2, arrayList);
        }
        HashMap hashMap2 = new HashMap();
        int i13 = aVar2.f112914c ? aVar2.f112916e + 1 : aVar2.f112916e;
        Iterator it2 = aVar2.f112917f.iterator();
        while (it2.hasNext()) {
            sh0.c cVar2 = (sh0.c) it2.next();
            Long valueOf3 = Long.valueOf(Long.parseLong(cVar2.f112922a));
            List list2 = cVar2.f112924c;
            Iterator it3 = it2;
            ArrayList arrayList2 = new ArrayList();
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                Object next = it4.next();
                Iterator it5 = it4;
                t82.e eVar2 = eVar;
                HashMap hashMap3 = hashMap;
                if (Long.parseLong(cVar2.f112922a) <= i13) {
                    arrayList2.add(next);
                }
                eVar = eVar2;
                it4 = it5;
                hashMap = hashMap3;
            }
            t82.e eVar3 = eVar;
            HashMap hashMap4 = hashMap;
            ArrayList arrayList3 = new ArrayList();
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                Object next2 = it6.next();
                if (((sh0.b) next2).f112921d) {
                    arrayList3.add(next2);
                }
            }
            ArrayList arrayList4 = new ArrayList(g0.q(arrayList3, 10));
            Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                arrayList4.add(Long.valueOf(Long.parseLong(((sh0.b) it7.next()).f112918a)));
            }
            hashMap2.put(valueOf3, arrayList4);
            eVar = eVar3;
            it2 = it3;
            hashMap = hashMap4;
        }
        t82.e eVar4 = eVar;
        HashMap hashMap5 = hashMap;
        HashMap hashMap6 = new HashMap();
        for (sh0.c cVar3 : aVar2.f112917f) {
            hashMap6.put(Long.valueOf(Long.parseLong(cVar3.f112922a)), Long.valueOf(cVar3.f112930i));
        }
        h hVar = new h(((b0) aVar.b(new t82.b(h03, h04, eVar4, hashMap5, hashMap2, hf0.b.a(), ((m60.d) a13).d(), valueOf, "Express", aVar3, hashMap6)).buildRequest()).r(tk2.e.f118017c).l(wj2.c.a()), new cp.b0(this, 9), 1);
        Intrinsics.checkNotNullExpressionValue(hVar, "doFinally(...)");
        addDisposable(nl.b.t(hVar, null, null, 3));
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void bindPinalytics(ExpressSurveyView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        getPresenterPinalytics().c(view.f45060f, view.f45059e, null);
        view.setPinalytics(getPinalytics());
        view.f45058d.setOnClickListener(new a(this, 2));
        view.f45056b.j(new yb0.b(this, 13));
    }

    public final void s3(long j13) {
        sh0.a aVar = this.f117637a;
        sh0.c cVar = (sh0.c) aVar.f112917f.get(aVar.f112916e);
        long j14 = j13 - this.f117644h;
        long j15 = cVar.f112930i;
        if (j15 > 0) {
            cVar.f112930i = j15 + j14;
        } else {
            cVar.f112930i = j14;
        }
    }

    @Override // yk1.p
    public final void unbindPinalytics() {
    }
}
