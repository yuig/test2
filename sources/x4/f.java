package x4;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f131743b;

    /* renamed from: a, reason: collision with root package name */
    public HashMap f131744a = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        f131743b = hashMap;
        try {
            hashMap.put("KeyAttribute", d.class.getConstructor(new Class[0]));
            hashMap.put("KeyPosition", h.class.getConstructor(new Class[0]));
            hashMap.put("KeyCycle", e.class.getConstructor(new Class[0]));
            hashMap.put("KeyTimeCycle", i.class.getConstructor(new Class[0]));
            hashMap.put("KeyTrigger", j.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e13) {
            Log.e("KeyFrames", "unable to load", e13);
        }
    }

    public f(Context context, XmlResourceParser xmlResourceParser) {
        Exception e13;
        b bVar;
        Constructor constructor;
        HashMap hashMap;
        HashMap hashMap2;
        try {
            int eventType = xmlResourceParser.getEventType();
            b bVar2 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    HashMap hashMap3 = f131743b;
                    if (hashMap3.containsKey(name)) {
                        try {
                            constructor = (Constructor) hashMap3.get(name);
                        } catch (Exception e14) {
                            b bVar3 = bVar2;
                            e13 = e14;
                            bVar = bVar3;
                        }
                        if (constructor == null) {
                            throw new NullPointerException("Keymaker for " + name + " not found");
                        }
                        bVar = (b) constructor.newInstance(new Object[0]);
                        try {
                            bVar.d(context, Xml.asAttributeSet(xmlResourceParser));
                            b(bVar);
                        } catch (Exception e15) {
                            e13 = e15;
                            Log.e("KeyFrames", "unable to create ", e13);
                            bVar2 = bVar;
                            eventType = xmlResourceParser.next();
                        }
                        bVar2 = bVar;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (bVar2 != null && (hashMap2 = bVar2.f131661d) != null) {
                            androidx.constraintlayout.widget.c.e(context, xmlResourceParser, hashMap2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && bVar2 != null && (hashMap = bVar2.f131661d) != null) {
                        androidx.constraintlayout.widget.c.e(context, xmlResourceParser, hashMap);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e16) {
            e16.printStackTrace();
        } catch (XmlPullParserException e17) {
            e17.printStackTrace();
        }
    }

    public final void a(m mVar) {
        Integer valueOf = Integer.valueOf(mVar.f131778c);
        HashMap hashMap = this.f131744a;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            mVar.f131798w.addAll(arrayList);
        }
        ArrayList arrayList2 = (ArrayList) hashMap.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                String str = ((ConstraintLayout.LayoutParams) mVar.f131777b.getLayoutParams()).Y;
                String str2 = bVar.f131660c;
                if (str2 != null && str != null && str.matches(str2)) {
                    mVar.a(bVar);
                }
            }
        }
    }

    public final void b(b bVar) {
        Integer valueOf = Integer.valueOf(bVar.f131659b);
        HashMap hashMap = this.f131744a;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(bVar.f131659b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(bVar.f131659b));
        if (arrayList != null) {
            arrayList.add(bVar);
        }
    }
}
