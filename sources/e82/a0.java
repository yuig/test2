package e82;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes4.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f57816a = new HashSet(Arrays.asList("com.google.android.apps.plus"));

    /* renamed from: b, reason: collision with root package name */
    public static final l0.w f57817b;

    static {
        l0.w wVar = new l0.w();
        wVar.put("com.facebook.katana", p32.f.FACEBOOK);
        wVar.put("com.kakao.talk", p32.f.KAKAO);
        wVar.put("jp.naver.line.android", p32.f.LINE);
        wVar.put("com.facebook.orca", p32.f.FACEBOOK_MESSENGER);
        wVar.put("com.twitter.android", p32.f.TWITTER);
        wVar.put("com.tencent.mm", p32.f.WECHAT);
        wVar.put("com.whatsapp", p32.f.WHATSAPP);
        wVar.put("com.facebook.lite", p32.f.FACEBOOK_LITE);
        wVar.put("com.facebook.mlite", p32.f.FACEBOOK_MESSENGER_LITE);
        wVar.put("com.viber.voip", p32.f.VIBER);
        wVar.put("com.skype.raider", p32.f.SKYPE);
        wVar.put("org.telegram.messenger", p32.f.TELEGRAM);
        wVar.put("com.instagram.android", p32.f.INSTAGRAM);
        wVar.put("com.reddit.frontpage", p32.f.REDDIT);
        wVar.put("com.snapchat.android", p32.f.SNAPCHAT);
        p32.f fVar = p32.f.EMAIL_APP;
        wVar.put("com.android.email", fVar);
        wVar.put("com.google.android.gm", fVar);
        p32.f fVar2 = p32.f.SMS;
        wVar.put("com.android.messaging", fVar2);
        wVar.put("com.google.android.apps.messaging", fVar2);
        wVar.put("com.google.android.babel", fVar2);
        wVar.put("com.android.mms", fVar2);
        wVar.put("com.samsung.android.messaging", fVar2);
        f57817b = wVar;
    }

    public static p32.f a(String str) {
        l0.w wVar = f57817b;
        return wVar.containsKey(str) ? (p32.f) wVar.get(str) : p32.f.OTHER;
    }
}
