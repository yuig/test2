package gj;

import android.util.Property;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class c extends Property {

    /* renamed from: a, reason: collision with root package name */
    public static final c f65173a = new c(Float.class, "childrenAlpha");

    @Override // android.util.Property
    public final Object get(Object obj) {
        Float f13 = (Float) ((ViewGroup) obj).getTag(fj.g.mtrl_internal_children_alpha_tag);
        return f13 != null ? f13 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Float f13 = (Float) obj2;
        float floatValue = f13.floatValue();
        viewGroup.setTag(fj.g.mtrl_internal_children_alpha_tag, f13);
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            viewGroup.getChildAt(i13).setAlpha(floatValue);
        }
    }
}
