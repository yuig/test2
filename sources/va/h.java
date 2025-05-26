package va;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import ao2.m0;
import kh2.k3;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class h extends l {
    public final void c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (m0.N(xmlPullParser, "pathData")) {
            TypedArray d03 = m0.d0(resources, theme, attributeSet, a.f125020d);
            String string = d03.getString(0);
            if (string != null) {
                this.f125061b = string;
            }
            String string2 = d03.getString(1);
            if (string2 != null) {
                this.f125060a = k3.I(string2);
            }
            this.f125062c = m0.D(d03, xmlPullParser, "fillType", 2, 0);
            d03.recycle();
        }
    }
}
