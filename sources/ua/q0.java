package ua;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.transition.Transition;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f121343b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final g1.g f121344c = new g1.g();

    /* renamed from: a, reason: collision with root package name */
    public final Context f121345a;

    public q0(Context context) {
        this.f121345a = context;
    }

    public final Object a(AttributeSet attributeSet, Class cls, String str) {
        Object newInstance;
        Class<? extends U> asSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue == null) {
            throw new InflateException(str.concat(" tag must have a 'class' attribute"));
        }
        try {
            g1.g gVar = f121344c;
            synchronized (gVar) {
                try {
                    Constructor constructor = (Constructor) gVar.get(attributeValue);
                    if (constructor == null && (asSubclass = Class.forName(attributeValue, false, this.f121345a.getClassLoader()).asSubclass(cls)) != 0) {
                        constructor = asSubclass.getConstructor(f121343b);
                        constructor.setAccessible(true);
                        gVar.put(attributeValue, constructor);
                    }
                    newInstance = constructor.newInstance(this.f121345a, attributeSet);
                } finally {
                }
            }
            return newInstance;
        } catch (Exception e13) {
            throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x021f, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.transition.Transition b(android.content.res.XmlResourceParser r17, android.util.AttributeSet r18, androidx.transition.Transition r19) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.q0.b(android.content.res.XmlResourceParser, android.util.AttributeSet, androidx.transition.Transition):androidx.transition.Transition");
    }

    public final Transition c(int i13) {
        XmlResourceParser xml = this.f121345a.getResources().getXml(i13);
        try {
            try {
                return b(xml, Xml.asAttributeSet(xml), null);
            } catch (IOException e13) {
                throw new InflateException(xml.getPositionDescription() + ": " + e13.getMessage(), e13);
            } catch (XmlPullParserException e14) {
                throw new InflateException(e14.getMessage(), e14);
            }
        } finally {
            xml.close();
        }
    }
}
