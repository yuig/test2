package com.pinterest.shuffles.scene.composer;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Size;
import android.view.animation.LinearInterpolator;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r72.d1;
import r72.e1;
import r72.f1;
import r72.g1;
import r72.k1;
import r72.z1;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final ke2.c f52150a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f52151b;

    /* renamed from: c, reason: collision with root package name */
    public e1 f52152c;

    /* renamed from: d, reason: collision with root package name */
    public AnimatorSet f52153d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f52154e;

    public t(ke2.c scene, Function0 sizeProvider) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(sizeProvider, "sizeProvider");
        this.f52150a = scene;
        this.f52151b = sizeProvider;
        this.f52154e = new ArrayList();
    }

    public static Keyframe b(d1 d1Var, float f13, a aVar) {
        TimeInterpolator linearInterpolator;
        Keyframe ofObject = Keyframe.ofObject(f13, aVar);
        int i13 = s.f52143b[d1Var.f106459d.ordinal()];
        if (i13 == 1) {
            linearInterpolator = new LinearInterpolator();
        } else if (i13 == 2) {
            linearInterpolator = new y0();
        } else if (i13 == 3) {
            linearInterpolator = new y0(0);
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            linearInterpolator = new x4.l();
        }
        ofObject.setInterpolator(linearInterpolator);
        Intrinsics.checkNotNullExpressionValue(ofObject, "apply(...)");
        return ofObject;
    }

    public static ArrayList d(List list, List list2) {
        List list3 = list2;
        int a13 = kotlin.collections.y0.a(kotlin.collections.g0.q(list3, 10));
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (Object obj : list3) {
            linkedHashMap.put(new k1(((g1) obj).f106479a), obj);
        }
        List<g1> list4 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list4, 10));
        for (g1 g1Var : list4) {
            g1 g1Var2 = (g1) linkedHashMap.get(new k1(g1Var.f106479a));
            arrayList.add(g1.a(g1Var, g1Var2 != null ? g1Var2.f106481c : g1Var.f106481c, null, 0.0d, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE));
        }
        return arrayList;
    }

    public final AnimatorSet a(e1 e1Var) {
        List list;
        Iterator it;
        Collection collection;
        List list2 = e1Var.f106463a;
        List<g1> list3 = ((d1) CollectionsKt.S(list2)).f106458c;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list3, 10));
        for (g1 g1Var : list3) {
            ke2.d c13 = c(g1Var.f106479a);
            Intrinsics.f(c13);
            z1 r03 = kh2.b0.r0(c13);
            Intrinsics.f(r03);
            arrayList.add(pe.i.c(r03, g1Var.f106479a));
        }
        int[] iArr = s.f52142a;
        f1 f1Var = e1Var.f106464b;
        int i13 = iArr[f1Var.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                d1 d1Var = (d1) CollectionsKt.b0(list2);
                list2 = CollectionsKt.m0(d1.a(d1Var, d(arrayList, d1Var.f106458c), null, 11), list2);
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                yk2.b bVar = new yk2.b();
                bVar.addAll(list2);
                Iterator it2 = CollectionsKt.q0(list2).iterator();
                if (it2.hasNext()) {
                    ArrayList arrayList2 = new ArrayList();
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        d1 d1Var2 = (d1) next2;
                        d1 d1Var3 = (d1) next;
                        arrayList2.add(d1.a(d1Var2, d(d1Var2.f106458c, d1Var3.f106458c), d1Var3.f106459d, 3));
                        next = next2;
                    }
                    collection = arrayList2;
                } else {
                    collection = kotlin.collections.q0.f80391a;
                }
                bVar.addAll(collection);
                bVar.add(d1.a((d1) CollectionsKt.S(list2), arrayList, null, 11));
                list2 = kotlin.collections.e0.a(bVar);
            }
        }
        List list4 = list2;
        Iterator it3 = list4.iterator();
        long j13 = 0;
        while (it3.hasNext()) {
            j13 += zn2.b.e(((d1) it3.next()).f106457b);
        }
        ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list4, 10));
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Float.valueOf(zn2.b.e(((d1) it4.next()).f106457b) / j13));
        }
        Float valueOf = Float.valueOf(0.0f);
        int q13 = kotlin.collections.g0.q(arrayList3, 9);
        if (q13 == 0) {
            list = kotlin.collections.e0.b(valueOf);
        } else {
            ArrayList arrayList4 = new ArrayList(q13 + 1);
            arrayList4.add(valueOf);
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                valueOf = Float.valueOf(valueOf.floatValue() + ((Number) it5.next()).floatValue());
                arrayList4.add(valueOf);
            }
            list = arrayList4;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it6 = list4.iterator();
        int i14 = 0;
        while (it6.hasNext()) {
            Object next3 = it6.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            d1 d1Var4 = (d1) next3;
            for (g1 g1Var2 : d1Var4.f106458c) {
                ke2.d c14 = c(g1Var2.f106479a);
                Intrinsics.f(c14);
                String str = g1Var2.f106479a;
                k1 k1Var = new k1(str);
                Object obj = linkedHashMap.get(k1Var);
                ke2.i iVar = c14.f79319a;
                Function0 function0 = this.f52151b;
                if (obj == null) {
                    z1 r04 = kh2.b0.r0(c14);
                    Intrinsics.f(r04);
                    it = it6;
                    ArrayList l13 = kotlin.collections.f0.l(b(d1Var4, ((Number) list.get(0)).floatValue(), new a(pe.i.c(r04, str), (Size) function0.invoke(), iVar)));
                    linkedHashMap.put(k1Var, l13);
                    obj = l13;
                } else {
                    it = it6;
                }
                ((List) obj).add(b(d1Var4, ((Number) list.get(i15)).floatValue(), new a(g1Var2, (Size) function0.invoke(), iVar)));
                it6 = it;
            }
            i14 = i15;
        }
        ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ke2.d c15 = c(((k1) entry.getKey()).f106527a);
            Intrinsics.f(c15);
            Keyframe[] keyframeArr = (Keyframe[]) ((Collection) entry.getValue()).toArray(new Keyframe[0]);
            PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(AnimatedTarget.PROPERTY_STATE, (Keyframe[]) Arrays.copyOf(keyframeArr, keyframeArr.length));
            ofKeyframe.setEvaluator(new ua.p(0));
            AnimatedTarget animatedTarget = new AnimatedTarget(c15);
            this.f52154e.add(animatedTarget);
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(animatedTarget, ofKeyframe);
            ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
            ofPropertyValuesHolder.setDuration(j13);
            ofPropertyValuesHolder.setRepeatCount(-1);
            int i16 = s.f52142a[f1Var.ordinal()];
            if (i16 != 1 && i16 != 2) {
                if (i16 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ofPropertyValuesHolder.setRepeatMode(1);
                arrayList5.add(ofPropertyValuesHolder);
            }
            ofPropertyValuesHolder.setRepeatMode(1);
            arrayList5.add(ofPropertyValuesHolder);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList5);
        return animatorSet;
    }

    public final ke2.d c(String str) {
        Object obj;
        r72.k0 a13;
        Iterator it = this.f52150a.f79314f.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ke2.d dVar = (ke2.d) next;
            Intrinsics.f(dVar);
            z1 r03 = kh2.b0.r0(dVar);
            if (r03 != null && (a13 = r03.a()) != null) {
                obj = a13.f106526n;
            }
            if (obj != null && Intrinsics.d(obj, str)) {
                obj = next;
                break;
            }
        }
        return (ke2.d) obj;
    }

    public final void e() {
        Object m13;
        AnimatorSet animatorSet = this.f52153d;
        if (animatorSet == null) {
            e1 e1Var = this.f52152c;
            if (e1Var != null) {
                try {
                    xk2.q qVar = xk2.s.f135225b;
                    m13 = a(e1Var);
                } catch (Throwable th3) {
                    xk2.q qVar2 = xk2.s.f135225b;
                    m13 = ue.c.m(th3);
                }
                animatorSet = (AnimatorSet) (m13 instanceof xk2.r ? null : m13);
            } else {
                animatorSet = null;
            }
        }
        this.f52153d = animatorSet;
    }

    public final void f(e1 e1Var) {
        if (Intrinsics.d(this.f52152c, e1Var)) {
            return;
        }
        AnimatorSet animatorSet = this.f52153d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f52153d = null;
        this.f52152c = e1Var;
    }

    public final void g(float f13) {
        ArrayList<Animator> childAnimations;
        AnimatorSet animatorSet = this.f52153d;
        if (animatorSet == null || (childAnimations = animatorSet.getChildAnimations()) == null) {
            return;
        }
        for (Animator animator : childAnimations) {
            ObjectAnimator objectAnimator = animator instanceof ObjectAnimator ? (ObjectAnimator) animator : null;
            if (objectAnimator != null) {
                objectAnimator.setCurrentFraction(f13);
            }
        }
    }
}
