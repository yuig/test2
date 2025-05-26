package wi;

import com.google.android.gms.ads.RequestConfiguration;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class w {
    public static final w MAX_AD_CONTENT_RATING_G;
    public static final w MAX_AD_CONTENT_RATING_MA;
    public static final w MAX_AD_CONTENT_RATING_PG;
    public static final w MAX_AD_CONTENT_RATING_T;
    public static final w MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ w[] f129988b;

    /* renamed from: a, reason: collision with root package name */
    private final String f129989a;

    static {
        w wVar = new w(0, "MAX_AD_CONTENT_RATING_UNSPECIFIED", "");
        MAX_AD_CONTENT_RATING_UNSPECIFIED = wVar;
        w wVar2 = new w(1, "MAX_AD_CONTENT_RATING_G", RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        MAX_AD_CONTENT_RATING_G = wVar2;
        w wVar3 = new w(2, "MAX_AD_CONTENT_RATING_PG", RequestConfiguration.MAX_AD_CONTENT_RATING_PG);
        MAX_AD_CONTENT_RATING_PG = wVar3;
        w wVar4 = new w(3, "MAX_AD_CONTENT_RATING_T", RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        MAX_AD_CONTENT_RATING_T = wVar4;
        w wVar5 = new w(4, "MAX_AD_CONTENT_RATING_MA", RequestConfiguration.MAX_AD_CONTENT_RATING_MA);
        MAX_AD_CONTENT_RATING_MA = wVar5;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4, wVar5};
        f129988b = wVarArr;
        l0.b0(wVarArr);
    }

    private w(int i13, String str, String str2) {
        this.f129989a = str2;
    }

    public static w[] values() {
        return (w[]) f129988b.clone();
    }

    @NotNull
    public final String getValue() {
        return this.f129989a;
    }
}
