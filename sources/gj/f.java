package gj;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import g1.o0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f65177a = new o0();

    /* renamed from: b, reason: collision with root package name */
    public final o0 f65178b = new o0();

    public static f a(Context context, TypedArray typedArray, int i13) {
        int resourceId;
        if (!typedArray.hasValue(i13) || (resourceId = typedArray.getResourceId(i13, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static f b(Context context, int i13) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i13);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception e13) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i13), e13);
            return null;
        }
    }

    public static f c(ArrayList arrayList) {
        f fVar = new f();
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Animator animator = (Animator) arrayList.get(i13);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            fVar.h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = a.f65168b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = a.f65169c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = a.f65170d;
            }
            g gVar = new g();
            gVar.f65182d = 0;
            gVar.f65183e = 1;
            gVar.f65179a = startDelay;
            gVar.f65180b = duration;
            gVar.f65181c = interpolator;
            gVar.f65182d = objectAnimator.getRepeatCount();
            gVar.f65183e = objectAnimator.getRepeatMode();
            fVar.f65177a.put(propertyName, gVar);
        }
        return fVar;
    }

    public final ObjectAnimator d(String str, ExtendedFloatingActionButton extendedFloatingActionButton, Property property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(extendedFloatingActionButton, e(str));
        ofPropertyValuesHolder.setProperty(property);
        f(str).a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    public final PropertyValuesHolder[] e(String str) {
        if (!g(str)) {
            throw new IllegalArgumentException();
        }
        PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) this.f65178b.get(str);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i13 = 0; i13 < propertyValuesHolderArr.length; i13++) {
            propertyValuesHolderArr2[i13] = propertyValuesHolderArr[i13].clone();
        }
        return propertyValuesHolderArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return this.f65177a.equals(((f) obj).f65177a);
        }
        return false;
    }

    public final g f(String str) {
        o0 o0Var = this.f65177a;
        if (o0Var.get(str) != null) {
            return (g) o0Var.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean g(String str) {
        return this.f65178b.get(str) != null;
    }

    public final void h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f65178b.put(str, propertyValuesHolderArr);
    }

    public final int hashCode() {
        return this.f65177a.hashCode();
    }

    public final String toString() {
        return "\n" + f.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f65177a + "}\n";
    }
}
