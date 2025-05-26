package x4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.c2;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kh2.n3;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final MotionLayout f131874a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.constraintlayout.widget.x f131875b;

    /* renamed from: c, reason: collision with root package name */
    public y f131876c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f131877d;

    /* renamed from: e, reason: collision with root package name */
    public final y f131878e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f131879f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f131880g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f131881h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseIntArray f131882i;

    /* renamed from: j, reason: collision with root package name */
    public int f131883j;

    /* renamed from: k, reason: collision with root package name */
    public int f131884k;

    /* renamed from: l, reason: collision with root package name */
    public MotionEvent f131885l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f131886m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f131887n;

    /* renamed from: o, reason: collision with root package name */
    public s f131888o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f131889p;

    /* renamed from: q, reason: collision with root package name */
    public final c2 f131890q;

    /* renamed from: r, reason: collision with root package name */
    public float f131891r;

    /* renamed from: s, reason: collision with root package name */
    public float f131892s;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public z(Context context, MotionLayout motionLayout, int i13) {
        Object obj = null;
        this.f131875b = null;
        this.f131876c = null;
        ArrayList arrayList = new ArrayList();
        this.f131877d = arrayList;
        this.f131878e = null;
        this.f131879f = new ArrayList();
        this.f131880g = new SparseArray();
        this.f131881h = new HashMap();
        this.f131882i = new SparseIntArray();
        this.f131883j = 400;
        this.f131884k = 0;
        this.f131886m = false;
        this.f131887n = false;
        this.f131874a = motionLayout;
        this.f131890q = new c2(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i13);
        try {
            int eventType = xml.getEventType();
            y yVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    char c13 = 2;
                    if (eventType == 2) {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c13 = 5;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case -1239391468:
                                if (name.equals("KeyFrameSet")) {
                                    c13 = '\b';
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case -687739768:
                                if (name.equals("Include")) {
                                    c13 = 7;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 61998586:
                                if (name.equals("ViewTransition")) {
                                    c13 = '\t';
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 269306229:
                                if (name.equals("Transition")) {
                                    c13 = 1;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 312750793:
                                if (name.equals("OnClick")) {
                                    c13 = 3;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 327855227:
                                if (name.equals("OnSwipe")) {
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 793277014:
                                if (name.equals("MotionScene")) {
                                    c13 = 0;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    c13 = 4;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 1942574248:
                                if (name.equals("include")) {
                                    c13 = 6;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            default:
                                c13 = 65535;
                                break;
                        }
                        switch (c13) {
                            case 0:
                                j(context, xml);
                                break;
                            case 1:
                                yVar = new y(this, context, xml);
                                arrayList.add(yVar);
                                if (this.f131876c == null && !yVar.f131857b) {
                                    this.f131876c = yVar;
                                    b0 b0Var = yVar.f131867l;
                                    if (b0Var != null) {
                                        b0Var.c(this.f131889p);
                                    }
                                }
                                if (yVar.f131857b) {
                                    if (yVar.f131858c == -1) {
                                        this.f131878e = yVar;
                                    } else {
                                        this.f131879f.add(yVar);
                                    }
                                    arrayList.remove(yVar);
                                    break;
                                }
                                break;
                            case 2:
                                if (yVar == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i13) + ".xml:" + xml.getLineNumber() + ")");
                                }
                                if (yVar != null) {
                                    yVar.f131867l = new b0(context, this.f131874a, xml);
                                    break;
                                }
                                break;
                            case 3:
                                if (yVar != null) {
                                    yVar.f131868m.add(new x(context, yVar, xml));
                                    break;
                                }
                                break;
                            case 4:
                                this.f131875b = new androidx.constraintlayout.widget.x(context, xml);
                                break;
                            case 5:
                                g(context, xml);
                                break;
                            case 6:
                            case 7:
                                i(context, xml);
                                break;
                            case '\b':
                                f fVar = new f(context, xml);
                                if (yVar != null) {
                                    yVar.f131866k.add(fVar);
                                    break;
                                }
                                break;
                            case '\t':
                                d0 d0Var = new d0(context, xml);
                                c2 c2Var = this.f131890q;
                                ((ArrayList) c2Var.f16532c).add(d0Var);
                                c2Var.f16533d = obj;
                                int i14 = d0Var.f131718b;
                                if (i14 != 4) {
                                    if (i14 == 5) {
                                        ConstraintLayout.getSharedValues().a(d0Var.f131737u, new e0(c2Var, d0Var, d0Var.f131737u, false, d0Var.f131736t));
                                        break;
                                    }
                                } else {
                                    ConstraintLayout.getSharedValues().a(d0Var.f131737u, new e0(c2Var, d0Var, d0Var.f131737u, true, d0Var.f131736t));
                                    break;
                                }
                                break;
                        }
                    }
                } else {
                    xml.getName();
                }
                eventType = xml.next();
                obj = null;
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        } catch (XmlPullParserException e14) {
            e14.printStackTrace();
        }
        this.f131880g.put(androidx.constraintlayout.widget.r.motion_base, new androidx.constraintlayout.widget.p());
        this.f131881h.put("motion_base", Integer.valueOf(androidx.constraintlayout.widget.r.motion_base));
    }

    public final boolean a(int i13, MotionLayout motionLayout) {
        y yVar;
        if (this.f131888o != null) {
            return false;
        }
        Iterator it = this.f131877d.iterator();
        while (it.hasNext()) {
            y yVar2 = (y) it.next();
            int i14 = yVar2.f131869n;
            if (i14 != 0 && ((yVar = this.f131876c) != yVar2 || (yVar.f131873r & 2) == 0)) {
                if (i13 == yVar2.f131859d && (i14 == 4 || i14 == 2)) {
                    v vVar = v.FINISHED;
                    motionLayout.P0(vVar);
                    motionLayout.T0(yVar2);
                    if (yVar2.f131869n == 4) {
                        motionLayout.b1();
                        motionLayout.P0(v.SETUP);
                        motionLayout.P0(v.MOVING);
                    } else {
                        motionLayout.K0(1.0f);
                        motionLayout.k0(true);
                        motionLayout.P0(v.SETUP);
                        motionLayout.P0(v.MOVING);
                        motionLayout.P0(vVar);
                        motionLayout.G0();
                    }
                    return true;
                }
                if (i13 == yVar2.f131858c && (i14 == 3 || i14 == 1)) {
                    v vVar2 = v.FINISHED;
                    motionLayout.P0(vVar2);
                    motionLayout.T0(yVar2);
                    if (yVar2.f131869n == 3) {
                        motionLayout.d0(0.0f);
                        motionLayout.P0(v.SETUP);
                        motionLayout.P0(v.MOVING);
                    } else {
                        motionLayout.K0(0.0f);
                        motionLayout.k0(true);
                        motionLayout.P0(v.SETUP);
                        motionLayout.P0(v.MOVING);
                        motionLayout.P0(vVar2);
                        motionLayout.G0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final androidx.constraintlayout.widget.p b(int i13) {
        int c13;
        SparseArray sparseArray = this.f131880g;
        androidx.constraintlayout.widget.x xVar = this.f131875b;
        if (xVar != null && (c13 = xVar.c(i13)) != -1) {
            i13 = c13;
        }
        if (sparseArray.get(i13) != null) {
            return (androidx.constraintlayout.widget.p) sparseArray.get(i13);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + n3.w(this.f131874a.getContext(), i13) + " In MotionScene");
        return (androidx.constraintlayout.widget.p) sparseArray.get(sparseArray.keyAt(0));
    }

    public final int c(Context context, String str) {
        int i13;
        if (str.contains("/")) {
            i13 = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            i13 = -1;
        }
        if (i13 != -1) {
            return i13;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return i13;
    }

    public final void d(m mVar) {
        y yVar = this.f131876c;
        if (yVar != null) {
            Iterator it = yVar.f131866k.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(mVar);
            }
        } else {
            y yVar2 = this.f131878e;
            if (yVar2 != null) {
                Iterator it2 = yVar2.f131866k.iterator();
                while (it2.hasNext()) {
                    ((f) it2.next()).a(mVar);
                }
            }
        }
    }

    public final float e() {
        b0 b0Var;
        y yVar = this.f131876c;
        if (yVar == null || (b0Var = yVar.f131867l) == null) {
            return 0.0f;
        }
        return b0Var.f131681t;
    }

    public final int f() {
        y yVar = this.f131876c;
        if (yVar == null) {
            return -1;
        }
        return yVar.f131859d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int g(Context context, XmlResourceParser xmlResourceParser) {
        boolean z13;
        boolean z14;
        androidx.constraintlayout.widget.p pVar = new androidx.constraintlayout.widget.p();
        pVar.f17856e = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < attributeCount; i15++) {
            String attributeName = xmlResourceParser.getAttributeName(i15);
            String attributeValue = xmlResourceParser.getAttributeValue(i15);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        z13 = false;
                        break;
                    }
                    z13 = -1;
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        z13 = true;
                        break;
                    }
                    z13 = -1;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        z13 = 2;
                        break;
                    }
                    z13 = -1;
                    break;
                default:
                    z13 = -1;
                    break;
            }
            switch (z13) {
                case false:
                    i14 = c(context, attributeValue);
                    break;
                case true:
                    try {
                        pVar.f17854c = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    z14 = false;
                                    break;
                                }
                                z14 = -1;
                                break;
                            case 3317767:
                                if (attributeValue.equals("left")) {
                                    z14 = true;
                                    break;
                                }
                                z14 = -1;
                                break;
                            case 3387192:
                                if (attributeValue.equals("none")) {
                                    z14 = 2;
                                    break;
                                }
                                z14 = -1;
                                break;
                            case 108511772:
                                if (attributeValue.equals("right")) {
                                    z14 = 3;
                                    break;
                                }
                                z14 = -1;
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    z14 = 4;
                                    break;
                                }
                                z14 = -1;
                                break;
                            default:
                                z14 = -1;
                                break;
                        }
                        switch (z14) {
                            case false:
                                pVar.f17854c = 4;
                                break;
                            case true:
                                pVar.f17854c = 2;
                                break;
                            case true:
                                pVar.f17854c = 0;
                                break;
                            case true:
                                pVar.f17854c = 1;
                                break;
                            case true:
                                pVar.f17854c = 3;
                                break;
                        }
                    }
                case true:
                    i13 = c(context, attributeValue);
                    int indexOf = attributeValue.indexOf(47);
                    if (indexOf >= 0) {
                        attributeValue = attributeValue.substring(indexOf + 1);
                    }
                    this.f131881h.put(attributeValue, Integer.valueOf(i13));
                    pVar.f17852a = n3.w(context, i13);
                    break;
            }
        }
        if (i13 != -1) {
            int i16 = this.f131874a.f17556t;
            pVar.z(context, xmlResourceParser);
            if (i14 != -1) {
                this.f131882i.put(i13, i14);
            }
            this.f131880g.put(i13, pVar);
        }
        return i13;
    }

    public final int h(Context context, int i13) {
        XmlResourceParser xml = context.getResources().getXml(i13);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return g(context, xml);
                }
            }
            return -1;
        } catch (IOException e13) {
            e13.printStackTrace();
            return -1;
        } catch (XmlPullParserException e14) {
            e14.printStackTrace();
            return -1;
        }
    }

    public final void i(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.s.include);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = obtainStyledAttributes.getIndex(i13);
            if (index == androidx.constraintlayout.widget.s.include_constraintSet) {
                h(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void j(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.s.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = obtainStyledAttributes.getIndex(i13);
            if (index == androidx.constraintlayout.widget.s.MotionScene_defaultDuration) {
                int i14 = obtainStyledAttributes.getInt(index, this.f131883j);
                this.f131883j = i14;
                if (i14 < 8) {
                    this.f131883j = 8;
                }
            } else if (index == androidx.constraintlayout.widget.s.MotionScene_layoutDuringTransition) {
                this.f131884k = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void k(int i13, MotionLayout motionLayout) {
        SparseArray sparseArray = this.f131880g;
        androidx.constraintlayout.widget.p pVar = (androidx.constraintlayout.widget.p) sparseArray.get(i13);
        pVar.f17853b = pVar.f17852a;
        int i14 = this.f131882i.get(i13);
        HashMap hashMap = pVar.f17857f;
        if (i14 > 0) {
            k(i14, motionLayout);
            androidx.constraintlayout.widget.p pVar2 = (androidx.constraintlayout.widget.p) sparseArray.get(i14);
            if (pVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + n3.w(this.f131874a.getContext(), i14));
                return;
            }
            pVar.f17853b += "/" + pVar2.f17853b;
            HashMap hashMap2 = pVar2.f17857f;
            for (Integer num : hashMap2.keySet()) {
                num.intValue();
                androidx.constraintlayout.widget.k kVar = (androidx.constraintlayout.widget.k) hashMap2.get(num);
                if (!hashMap.containsKey(num)) {
                    hashMap.put(num, new androidx.constraintlayout.widget.k());
                }
                androidx.constraintlayout.widget.k kVar2 = (androidx.constraintlayout.widget.k) hashMap.get(num);
                if (kVar2 != null) {
                    androidx.constraintlayout.widget.l lVar = kVar2.f17767e;
                    if (!lVar.f17775b) {
                        lVar.a(kVar.f17767e);
                    }
                    androidx.constraintlayout.widget.n nVar = kVar2.f17765c;
                    if (!nVar.f17829a) {
                        nVar.a(kVar.f17765c);
                    }
                    androidx.constraintlayout.widget.o oVar = kVar2.f17768f;
                    if (!oVar.f17835a) {
                        oVar.a(kVar.f17768f);
                    }
                    androidx.constraintlayout.widget.m mVar = kVar2.f17766d;
                    if (!mVar.f17816a) {
                        mVar.a(kVar.f17766d);
                    }
                    for (String str : kVar.f17769g.keySet()) {
                        if (!kVar2.f17769g.containsKey(str)) {
                            kVar2.f17769g.put(str, (androidx.constraintlayout.widget.c) kVar.f17769g.get(str));
                        }
                    }
                }
            }
        } else {
            pVar.f17853b = a.a.p(new StringBuilder(), pVar.f17853b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = motionLayout.getChildAt(i15);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                int id3 = childAt.getId();
                if (pVar.f17856e && id3 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!hashMap.containsKey(Integer.valueOf(id3))) {
                    hashMap.put(Integer.valueOf(id3), new androidx.constraintlayout.widget.k());
                }
                androidx.constraintlayout.widget.k kVar3 = (androidx.constraintlayout.widget.k) hashMap.get(Integer.valueOf(id3));
                if (kVar3 != null) {
                    androidx.constraintlayout.widget.l lVar2 = kVar3.f17767e;
                    if (!lVar2.f17775b) {
                        kVar3.f(id3, layoutParams);
                        if (childAt instanceof ConstraintHelper) {
                            lVar2.f17792j0 = ((ConstraintHelper) childAt).k();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                lVar2.f17802o0 = barrier.y();
                                lVar2.f17786g0 = barrier.A();
                                lVar2.f17788h0 = barrier.z();
                            }
                        }
                        lVar2.f17775b = true;
                    }
                    androidx.constraintlayout.widget.n nVar2 = kVar3.f17765c;
                    if (!nVar2.f17829a) {
                        nVar2.f17830b = childAt.getVisibility();
                        nVar2.f17832d = childAt.getAlpha();
                        nVar2.f17829a = true;
                    }
                    androidx.constraintlayout.widget.o oVar2 = kVar3.f17768f;
                    if (!oVar2.f17835a) {
                        oVar2.f17835a = true;
                        oVar2.f17836b = childAt.getRotation();
                        oVar2.f17837c = childAt.getRotationX();
                        oVar2.f17838d = childAt.getRotationY();
                        oVar2.f17839e = childAt.getScaleX();
                        oVar2.f17840f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            oVar2.f17841g = pivotX;
                            oVar2.f17842h = pivotY;
                        }
                        oVar2.f17844j = childAt.getTranslationX();
                        oVar2.f17845k = childAt.getTranslationY();
                        oVar2.f17846l = childAt.getTranslationZ();
                        if (oVar2.f17847m) {
                            oVar2.f17848n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (androidx.constraintlayout.widget.k kVar4 : hashMap.values()) {
            if (kVar4.f17770h != null) {
                if (kVar4.f17764b != null) {
                    Iterator it = hashMap.keySet().iterator();
                    while (it.hasNext()) {
                        androidx.constraintlayout.widget.k x13 = pVar.x(((Integer) it.next()).intValue());
                        String str2 = x13.f17767e.f17796l0;
                        if (str2 != null && kVar4.f17764b.matches(str2)) {
                            kVar4.f17770h.e(x13);
                            x13.f17769g.putAll((HashMap) kVar4.f17769g.clone());
                        }
                    }
                } else {
                    kVar4.f17770h.e(pVar.x(kVar4.f17763a));
                }
            }
        }
    }

    public final void l(MotionLayout motionLayout) {
        int i13 = 0;
        loop0: while (true) {
            SparseArray sparseArray = this.f131880g;
            if (i13 >= sparseArray.size()) {
                return;
            }
            int keyAt = sparseArray.keyAt(i13);
            SparseIntArray sparseIntArray = this.f131882i;
            int i14 = sparseIntArray.get(keyAt);
            int size = sparseIntArray.size();
            while (i14 > 0) {
                if (i14 == keyAt) {
                    break loop0;
                }
                int i15 = size - 1;
                if (size < 0) {
                    break loop0;
                }
                i14 = sparseIntArray.get(i14);
                size = i15;
            }
            k(keyAt, motionLayout);
            i13++;
        }
        Log.e("MotionScene", "Cannot be derived from yourself");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r2 != (-1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(int r9, int r10) {
        /*
            r8 = this;
            androidx.constraintlayout.widget.x r0 = r8.f131875b
            r1 = -1
            if (r0 == 0) goto L18
            int r0 = r0.c(r9)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r9
        Ld:
            androidx.constraintlayout.widget.x r2 = r8.f131875b
            int r2 = r2.c(r10)
            if (r2 == r1) goto L16
            goto L1a
        L16:
            r2 = r10
            goto L1a
        L18:
            r0 = r9
            goto L16
        L1a:
            x4.y r3 = r8.f131876c
            if (r3 == 0) goto L27
            int r4 = r3.f131858c
            if (r4 != r10) goto L27
            int r3 = r3.f131859d
            if (r3 != r9) goto L27
            return
        L27:
            java.util.ArrayList r3 = r8.f131877d
            java.util.Iterator r4 = r3.iterator()
        L2d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()
            x4.y r5 = (x4.y) r5
            int r6 = r5.f131858c
            if (r6 != r2) goto L41
            int r7 = r5.f131859d
            if (r7 == r0) goto L47
        L41:
            if (r6 != r10) goto L2d
            int r6 = r5.f131859d
            if (r6 != r9) goto L2d
        L47:
            r8.f131876c = r5
            x4.b0 r9 = r5.f131867l
            if (r9 == 0) goto L52
            boolean r10 = r8.f131889p
            r9.c(r10)
        L52:
            return
        L53:
            x4.y r9 = r8.f131878e
            java.util.ArrayList r4 = r8.f131879f
            java.util.Iterator r4 = r4.iterator()
        L5b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r4.next()
            x4.y r5 = (x4.y) r5
            int r6 = r5.f131858c
            if (r6 != r10) goto L5b
            r9 = r5
            goto L5b
        L6d:
            x4.y r10 = new x4.y
            r10.<init>(r8, r9)
            r10.f131859d = r0
            r10.f131858c = r2
            if (r0 == r1) goto L7b
            r3.add(r10)
        L7b:
            r8.f131876c = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.z.m(int, int):void");
    }

    public final boolean n() {
        Iterator it = this.f131877d.iterator();
        while (it.hasNext()) {
            if (((y) it.next()).f131867l != null) {
                return true;
            }
        }
        y yVar = this.f131876c;
        return (yVar == null || yVar.f131867l == null) ? false : true;
    }
}
