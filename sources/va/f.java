package va;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import ao2.m0;
import java.util.ArrayList;
import lb.l0;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class f extends g implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public final Context f125032c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.appcompat.widget.d f125033d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f125034e = null;

    /* renamed from: f, reason: collision with root package name */
    public final j.a f125035f = new j.a(this);

    /* renamed from: b, reason: collision with root package name */
    public final d f125031b = new d();

    public f(Context context) {
        this.f125032c = context;
    }

    public static f b(Context context, int i13) {
        f fVar = new f(context);
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = e5.n.f57243a;
        Drawable drawable = resources.getDrawable(i13, theme);
        fVar.f125036a = drawable;
        drawable.setCallback(fVar.f125035f);
        new e(fVar.f125036a.getConstantState());
        return fVar;
    }

    public final void a() {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        androidx.appcompat.widget.d dVar = this.f125033d;
        if (dVar != null) {
            this.f125031b.f125026b.removeListener(dVar);
            this.f125033d = null;
        }
        ArrayList arrayList = this.f125034e;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // va.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    public final void c(c cVar) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            if (cVar.f125024a == null) {
                cVar.f125024a = new b(cVar);
            }
            animatedVectorDrawable.registerAnimationCallback(cVar.f125024a);
            return;
        }
        if (cVar == null) {
            return;
        }
        if (this.f125034e == null) {
            this.f125034e = new ArrayList();
        }
        if (this.f125034e.contains(cVar)) {
            return;
        }
        this.f125034e.add(cVar);
        if (this.f125033d == null) {
            this.f125033d = new androidx.appcompat.widget.d(this, 2);
        }
        this.f125031b.f125026b.addListener(this.f125033d);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public final void d(c cVar) {
        androidx.appcompat.widget.d dVar;
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            if (cVar.f125024a == null) {
                cVar.f125024a = new b(cVar);
            }
            animatedVectorDrawable.unregisterAnimationCallback(cVar.f125024a);
        }
        ArrayList arrayList = this.f125034e;
        if (arrayList == null || cVar == null) {
            return;
        }
        arrayList.remove(cVar);
        if (this.f125034e.size() != 0 || (dVar = this.f125033d) == null) {
            return;
        }
        this.f125031b.f125026b.removeListener(dVar);
        this.f125033d = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f125031b;
        dVar.f125025a.draw(canvas);
        if (dVar.f125026b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.getAlpha() : this.f125031b.f125025a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f125031b.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.getColorFilter() : this.f125031b.f125025a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f125036a != null) {
            return new e(this.f125036a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f125031b.f125025a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f125031b.f125025a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.getOpacity() : this.f125031b.f125025a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.isAutoMirrored() : this.f125031b.f125025a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f125036a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f125031b.f125026b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.isStateful() : this.f125031b.f125025a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f125031b.f125025a.setBounds(rect);
        }
    }

    @Override // va.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i13) {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.setLevel(i13) : this.f125031b.f125025a.setLevel(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.setState(iArr) : this.f125031b.f125025a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.setAlpha(i13);
        } else {
            this.f125031b.f125025a.setAlpha(i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z13) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.setAutoMirrored(z13);
        } else {
            this.f125031b.f125025a.setAutoMirrored(z13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f125031b.f125025a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i13) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            l0.m1(drawable, i13);
        } else {
            this.f125031b.f125025a.setTint(i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            l0.n1(drawable, colorStateList);
        } else {
            this.f125031b.f125025a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            l0.o1(drawable, mode);
        } else {
            this.f125031b.f125025a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z13, boolean z14) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            return drawable.setVisible(z13, z14);
        }
        this.f125031b.f125025a.setVisible(z13, z14);
        return super.setVisible(z13, z14);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f125031b;
        if (dVar.f125026b.isStarted()) {
            return;
        }
        dVar.f125026b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f125031b.f125026b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        d dVar;
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.f125031b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray d03 = m0.d0(resources, theme, attributeSet, a.f125021e);
                    int resourceId = d03.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p pVar = new p();
                        ThreadLocal threadLocal = e5.n.f57243a;
                        pVar.f125036a = resources.getDrawable(resourceId, theme);
                        new o(pVar.f125036a.getConstantState());
                        pVar.f125098f = false;
                        pVar.setCallback(this.f125035f);
                        p pVar2 = dVar.f125025a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        dVar.f125025a = pVar;
                    }
                    d03.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f125022f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f125032c;
                        if (context != null) {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                            loadAnimator.setTarget(dVar.f125025a.f125094b.f125081b.f125079o.get(string));
                            if (dVar.f125027c == null) {
                                dVar.f125027c = new ArrayList();
                                dVar.f125028d = new g1.g(0);
                            }
                            dVar.f125027c.add(loadAnimator);
                            dVar.f125028d.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.f125026b == null) {
            dVar.f125026b = new AnimatorSet();
        }
        dVar.f125026b.playTogether(dVar.f125027c);
    }
}
