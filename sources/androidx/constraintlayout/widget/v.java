package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f17862a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f17863b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final int f17864c;

    public v(Context context, XmlResourceParser xmlResourceParser) {
        this.f17864c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.State);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = obtainStyledAttributes.getIndex(i13);
            if (index == s.State_android_id) {
                this.f17862a = obtainStyledAttributes.getResourceId(index, this.f17862a);
            } else if (index == s.State_constraints) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f17864c);
                this.f17864c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
