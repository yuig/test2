package oi;

import android.accounts.AccountManager;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class p extends c5 {

    /* renamed from: c, reason: collision with root package name */
    public long f95001c;

    /* renamed from: d, reason: collision with root package name */
    public String f95002d;

    /* renamed from: e, reason: collision with root package name */
    public AccountManager f95003e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f95004f;

    /* renamed from: g, reason: collision with root package name */
    public long f95005g;

    @Override // oi.c5
    public final boolean s() {
        Calendar calendar = Calendar.getInstance();
        this.f95001c = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f95002d = a.a.D(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }
}
