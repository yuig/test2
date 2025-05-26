package i91;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final List f71921d = kotlin.collections.f0.j("com.facebook.katana", "com.kakao.talk", "jp.naver.line.android", "com.facebook.orca", "com.twitter.android", "com.tencent.mm", "com.whatsapp", "com.instagram.android", "com.facebook.lite", "com.facebook.mlite", "com.viber.voip", "com.snapchat.android", "com.reddit.frontpage", "com.skype.raider", "org.telegram.messenger");

    /* renamed from: a, reason: collision with root package name */
    public final e82.h0 f71922a;

    /* renamed from: b, reason: collision with root package name */
    public final b60.b f71923b;

    /* renamed from: c, reason: collision with root package name */
    public String f71924c;

    public z(e82.h0 socialUtils, b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(socialUtils, "socialUtils");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f71922a = socialUtils;
        this.f71923b = activeUserManager;
    }

    public final void a(String str) {
        if (CollectionsKt.L(f71921d, str)) {
            this.f71924c = str;
        } else if (str == null && ff0.j.f62103a) {
            this.f71924c = null;
        }
    }
}
