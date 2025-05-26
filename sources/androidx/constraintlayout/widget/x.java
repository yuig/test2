package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import com.google.android.gms.internal.measurement.q4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import q5.a2;
import q5.o1;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public int f17870a;

    /* renamed from: b, reason: collision with root package name */
    public int f17871b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f17872c = -1;

    /* renamed from: d, reason: collision with root package name */
    public Object f17873d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public Object f17874e = new SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public int[] f17875f = null;

    public x(Context context, XmlResourceParser xmlResourceParser) {
        this.f17870a = -1;
        v vVar = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.StateSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = obtainStyledAttributes.getIndex(i13);
            if (index == s.StateSet_defaultState) {
                this.f17870a = obtainStyledAttributes.getResourceId(index, this.f17870a);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            while (true) {
                char c13 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                c13 = 2;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                c13 = 0;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c13 = 3;
                                break;
                            }
                            c13 = 65535;
                            break;
                        default:
                            c13 = 65535;
                            break;
                    }
                    if (c13 == 2) {
                        vVar = new v(context, xmlResourceParser);
                        ((SparseArray) this.f17873d).put(vVar.f17862a, vVar);
                    } else if (c13 == 3) {
                        w wVar = new w(context, xmlResourceParser);
                        if (vVar != null) {
                            vVar.f17863b.add(wVar);
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        } catch (XmlPullParserException e14) {
            e14.printStackTrace();
        }
    }

    public final void a(a2 a2Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((o1) it.next()).f102491a.c() & 8) != 0) {
                ((View) this.f17874e).setTranslationY(gj.a.c(this.f17872c, r3.f102491a.b(), 0));
                return;
            }
        }
    }

    public final void b(q4 q4Var) {
        View view = (View) this.f17874e;
        int[] iArr = this.f17875f;
        view.getLocationOnScreen(iArr);
        int i13 = this.f17871b - iArr[1];
        this.f17872c = i13;
        view.setTranslationY(i13);
    }

    public final int c(int i13) {
        int i14;
        float f13 = -1;
        int i15 = 0;
        if (-1 == i13) {
            v vVar = i13 == -1 ? (v) ((SparseArray) this.f17873d).valueAt(0) : (v) ((SparseArray) this.f17873d).get(this.f17871b);
            if (vVar == null) {
                return -1;
            }
            int i16 = this.f17872c;
            ArrayList arrayList = vVar.f17863b;
            if (i16 != -1 && ((w) arrayList.get(-1)).a(f13, f13)) {
                return -1;
            }
            while (true) {
                ArrayList arrayList2 = vVar.f17863b;
                if (i15 >= arrayList2.size()) {
                    i15 = -1;
                    break;
                }
                if (((w) arrayList2.get(i15)).a(f13, f13)) {
                    break;
                }
                i15++;
            }
            if (-1 == i15) {
                return -1;
            }
            i14 = i15 == -1 ? vVar.f17864c : ((w) arrayList.get(i15)).f17869e;
        } else {
            v vVar2 = (v) ((SparseArray) this.f17873d).get(i13);
            if (vVar2 == null) {
                return -1;
            }
            while (true) {
                ArrayList arrayList3 = vVar2.f17863b;
                if (i15 >= arrayList3.size()) {
                    i15 = -1;
                    break;
                }
                if (((w) arrayList3.get(i15)).a(f13, f13)) {
                    break;
                }
                i15++;
            }
            i14 = i15 == -1 ? vVar2.f17864c : ((w) vVar2.f17863b.get(i15)).f17869e;
        }
        return i14;
    }
}
