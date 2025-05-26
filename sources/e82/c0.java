package e82;

import h32.u0;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.z0;

/* loaded from: classes4.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f57822a;

    static {
        Pair pair = new Pair("com.whatsapp", u0.SEND_SHARE_WHATSAPP_BUTTON);
        Pair pair2 = new Pair("com.tencent.mm", u0.SEND_SHARE_WECHAT_BUTTON);
        Pair pair3 = new Pair("com.kakao.talk", u0.SEND_SHARE_KAKAO_BUTTON);
        Pair pair4 = new Pair("jp.naver.line.android", u0.SEND_SHARE_LINE_BUTTON);
        Pair pair5 = new Pair("org.telegram.messenger", u0.SEND_SHARE_TELEGRAM_BUTTON);
        Pair pair6 = new Pair("com.viber.voip", u0.SEND_SHARE_VIBER_BUTTON);
        Pair pair7 = new Pair("com.instagram.android", u0.SEND_SHARE_INSTAGRAM_BUTTON);
        Pair pair8 = new Pair("com.reddit.frontpage", u0.SEND_SHARE_REDDIT_BUTTON);
        Pair pair9 = new Pair("com.skype.raider", u0.SEND_SHARE_SKYPE_BUTTON);
        Pair pair10 = new Pair("com.twitter.android", u0.SEND_SHARE_TWITTER_BUTTON);
        Pair pair11 = new Pair("com.facebook.orca", u0.SEND_SHARE_MESSENGER_BUTTON);
        Pair pair12 = new Pair("com.facebook.katana", u0.SEND_SHARE_FACEBOOK_BUTTON);
        Pair pair13 = new Pair("com.facebook.lite", u0.SEND_SHARE_FB_LITE_BUTTON);
        Pair pair14 = new Pair("com.facebook.mlite", u0.SEND_SHARE_FB_MESSENGER_LITE_BUTTON);
        u0 u0Var = u0.SEND_SHARE_SMS_BUTTON;
        Pair pair15 = new Pair("com.android.messaging", u0Var);
        Pair pair16 = new Pair("com.google.android.apps.messaging", u0Var);
        Pair pair17 = new Pair("com.android.mms", u0Var);
        Pair pair18 = new Pair("com.samsung.android.messaging", u0Var);
        u0 u0Var2 = u0.SEND_SHARE_EMAIL_BUTTON;
        f57822a = z0.g(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, new Pair("com.google.android.gm", u0Var2), new Pair("com.android.email", u0Var2), new Pair("copy_link", u0.SEND_SHARE_COPYLINK_BUTTON), new Pair("more_apps", u0.MORE_BUTTON));
    }
}
