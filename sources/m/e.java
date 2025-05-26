package m;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public final class e extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f85183f;

    /* renamed from: a, reason: collision with root package name */
    public int f85184a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f85185b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f85186c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f85187d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f85188e;

    public e(Context context, int i13) {
        super(context);
        this.f85184a = i13;
    }

    public final void a(Configuration configuration) {
        if (this.f85188e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f85187d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f85187d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f85185b == null) {
            this.f85185b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f85185b.setTo(theme);
            }
        }
        this.f85185b.applyStyle(this.f85184a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f85188e == null) {
            Configuration configuration = this.f85187d;
            if (configuration != null) {
                if (f85183f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f85183f = configuration2;
                }
                if (!configuration.equals(f85183f)) {
                    this.f85188e = createConfigurationContext(this.f85187d).getResources();
                }
            }
            this.f85188e = super.getResources();
        }
        return this.f85188e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f85186c == null) {
            this.f85186c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f85186c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f85185b;
        if (theme != null) {
            return theme;
        }
        if (this.f85184a == 0) {
            this.f85184a = i.i.Theme_AppCompat_Light;
        }
        b();
        return this.f85185b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i13) {
        if (this.f85184a != i13) {
            this.f85184a = i13;
            b();
        }
    }

    public e(Context context, Resources.Theme theme) {
        super(context);
        this.f85185b = theme;
    }
}
