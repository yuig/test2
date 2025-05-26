package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16696a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f16697b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f16698c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16699d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16700e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16701f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f16702g;

    public /* synthetic */ w(TextView textView, int i13) {
        this.f16696a = i13;
        this.f16702g = textView;
    }

    public final void a() {
        TextView textView = this.f16702g;
        Drawable buttonDrawable = ((CompoundButton) textView).getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f16699d || this.f16700e) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f16699d) {
                    mutate.setTintList(this.f16697b);
                }
                if (this.f16700e) {
                    mutate.setTintMode(this.f16698c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((CompoundButton) textView).getDrawableState());
                }
                ((CompoundButton) textView).setButtonDrawable(mutate);
            }
        }
    }

    public final void b() {
        TextView textView = this.f16702g;
        Drawable checkMarkDrawable = ((CheckedTextView) textView).getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f16699d || this.f16700e) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f16699d) {
                    mutate.setTintList(this.f16697b);
                }
                if (this.f16700e) {
                    mutate.setTintMode(this.f16698c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((CheckedTextView) textView).getDrawableState());
                }
                ((CheckedTextView) textView).setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075 A[Catch: all -> 0x004a, TryCatch #2 {all -> 0x004a, blocks: (B:5:0x0028, B:7:0x0030, B:10:0x0038, B:11:0x006d, B:13:0x0075, B:14:0x0081, B:16:0x0089, B:23:0x004c, B:25:0x0054, B:27:0x005c), top: B:4:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:5:0x0028, B:7:0x0030, B:10:0x0038, B:11:0x006d, B:13:0x0075, B:14:0x0081, B:16:0x0089, B:23:0x004c, B:25:0x0054, B:27:0x005c), top: B:4:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:33:0x00be, B:35:0x00c6, B:38:0x00ce, B:39:0x0103, B:41:0x010b, B:42:0x0117, B:44:0x011f, B:50:0x00e2, B:52:0x00ea, B:54:0x00f2), top: B:32:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011f A[Catch: all -> 0x00e0, TRY_LEAVE, TryCatch #0 {all -> 0x00e0, blocks: (B:33:0x00be, B:35:0x00c6, B:38:0x00ce, B:39:0x0103, B:41:0x010b, B:42:0x0117, B:44:0x011f, B:50:0x00e2, B:52:0x00ea, B:54:0x00f2), top: B:32:0x00be }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.util.AttributeSet r13, int r14) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w.c(android.util.AttributeSet, int):void");
    }
}
