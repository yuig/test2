package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f17736a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f17737b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final int f17738c;

    /* renamed from: d, reason: collision with root package name */
    public final p f17739d;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f17738c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.State);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = obtainStyledAttributes.getIndex(i13);
            if (index == s.State_android_id) {
                this.f17736a = obtainStyledAttributes.getResourceId(index, this.f17736a);
            } else if (index == s.State_constraints) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f17738c);
                this.f17738c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    p pVar = new p();
                    this.f17739d = pVar;
                    pVar.i(context, resourceId);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
