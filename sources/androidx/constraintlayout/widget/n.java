package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17829a;

    /* renamed from: b, reason: collision with root package name */
    public int f17830b;

    /* renamed from: c, reason: collision with root package name */
    public int f17831c;

    /* renamed from: d, reason: collision with root package name */
    public float f17832d;

    /* renamed from: e, reason: collision with root package name */
    public float f17833e;

    public final void a(n nVar) {
        this.f17829a = nVar.f17829a;
        this.f17830b = nVar.f17830b;
        this.f17832d = nVar.f17832d;
        this.f17833e = nVar.f17833e;
        this.f17831c = nVar.f17831c;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.PropertySet);
        this.f17829a = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = obtainStyledAttributes.getIndex(i13);
            if (index == s.PropertySet_android_alpha) {
                this.f17832d = obtainStyledAttributes.getFloat(index, this.f17832d);
            } else if (index == s.PropertySet_android_visibility) {
                int i14 = obtainStyledAttributes.getInt(index, this.f17830b);
                this.f17830b = i14;
                this.f17830b = p.f17849g[i14];
            } else if (index == s.PropertySet_visibilityMode) {
                this.f17831c = obtainStyledAttributes.getInt(index, this.f17831c);
            } else if (index == s.PropertySet_motionProgress) {
                this.f17833e = obtainStyledAttributes.getFloat(index, this.f17833e);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
