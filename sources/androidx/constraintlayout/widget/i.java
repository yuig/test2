package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f17746a;

    /* renamed from: b, reason: collision with root package name */
    public int f17747b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f17748c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f17749d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f17750e = new SparseArray();

    public i(Context context, ConstraintLayout constraintLayout, int i13) {
        this.f17746a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i13);
        try {
            int eventType = xml.getEventType();
            g gVar = null;
            while (true) {
                char c13 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c13 = 4;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c13 = 2;
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
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c13 = 0;
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
                        gVar = new g(context, xml);
                        this.f17749d.put(gVar.f17736a, gVar);
                    } else if (c13 == 3) {
                        h hVar = new h(context, xml);
                        if (gVar != null) {
                            gVar.f17737b.add(hVar);
                        }
                    } else if (c13 == 4) {
                        a(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        } catch (XmlPullParserException e14) {
            e14.printStackTrace();
        }
    }

    public final void a(Context context, XmlResourceParser xmlResourceParser) {
        p pVar = new p();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i13 = 0; i13 < attributeCount; i13++) {
            String attributeName = xmlResourceParser.getAttributeName(i13);
            String attributeValue = xmlResourceParser.getAttributeValue(i13);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                pVar.z(context, xmlResourceParser);
                this.f17750e.put(identifier, pVar);
                return;
            }
        }
    }

    public final void b(float f13, float f14, int i13) {
        int i14 = this.f17747b;
        SparseArray sparseArray = this.f17749d;
        int i15 = 0;
        ConstraintLayout constraintLayout = this.f17746a;
        if (i14 == i13) {
            g gVar = i13 == -1 ? (g) sparseArray.valueAt(0) : (g) sparseArray.get(i14);
            int i16 = this.f17748c;
            if (i16 == -1 || !((h) gVar.f17737b.get(i16)).a(f13, f14)) {
                while (true) {
                    ArrayList arrayList = gVar.f17737b;
                    if (i15 >= arrayList.size()) {
                        i15 = -1;
                        break;
                    } else if (((h) arrayList.get(i15)).a(f13, f14)) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (this.f17748c == i15) {
                    return;
                }
                ArrayList arrayList2 = gVar.f17737b;
                p pVar = i15 == -1 ? null : ((h) arrayList2.get(i15)).f17745f;
                if (i15 != -1) {
                    int i17 = ((h) arrayList2.get(i15)).f17744e;
                }
                if (pVar == null) {
                    return;
                }
                this.f17748c = i15;
                pVar.b(constraintLayout);
                return;
            }
            return;
        }
        this.f17747b = i13;
        g gVar2 = (g) sparseArray.get(i13);
        while (true) {
            ArrayList arrayList3 = gVar2.f17737b;
            if (i15 >= arrayList3.size()) {
                i15 = -1;
                break;
            } else if (((h) arrayList3.get(i15)).a(f13, f14)) {
                break;
            } else {
                i15++;
            }
        }
        ArrayList arrayList4 = gVar2.f17737b;
        p pVar2 = i15 == -1 ? gVar2.f17739d : ((h) arrayList4.get(i15)).f17745f;
        if (i15 != -1) {
            int i18 = ((h) arrayList4.get(i15)).f17744e;
        }
        if (pVar2 != null) {
            this.f17748c = i15;
            pVar2.b(constraintLayout);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i13 + ", dim =" + f13 + ", " + f14);
    }
}
