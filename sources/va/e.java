package va;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125029a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f125030b;

    public e(Drawable.ConstantState constantState) {
        this.f125030b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        switch (this.f125029a) {
            case 0:
                return ((Drawable.ConstantState) this.f125030b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f125029a) {
            case 0:
                return ((Drawable.ConstantState) this.f125030b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        int i13 = this.f125029a;
        Object obj = this.f125030b;
        switch (i13) {
            case 0:
                f fVar = new f(null);
                Drawable newDrawable = ((Drawable.ConstantState) obj).newDrawable();
                fVar.f125036a = newDrawable;
                newDrawable.setCallback(fVar.f125035f);
                return fVar;
            default:
                return (tj.b) obj;
        }
    }

    public e(tj.b bVar) {
        this.f125030b = bVar;
    }

    public /* synthetic */ e(tj.b bVar, int i13) {
        this(bVar);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.f125029a) {
            case 0:
                f fVar = new f(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f125030b).newDrawable(resources);
                fVar.f125036a = newDrawable;
                newDrawable.setCallback(fVar.f125035f);
                return fVar;
            default:
                return super.newDrawable(resources);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f125029a) {
            case 0:
                f fVar = new f(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f125030b).newDrawable(resources, theme);
                fVar.f125036a = newDrawable;
                newDrawable.setCallback(fVar.f125035f);
                return fVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
