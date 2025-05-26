package e5;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f57230a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f57231b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57232c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f57230a = colorStateList;
        this.f57231b = configuration;
        this.f57232c = theme == null ? 0 : theme.hashCode();
    }
}
