package bw0;

import com.pinterest.api.model.wn0;
import ja.c0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final c f24008a;

    public k(c commonWorkUtils) {
        Intrinsics.checkNotNullParameter(commonWorkUtils, "commonWorkUtils");
        this.f24008a = commonWorkUtils;
    }

    public static c0 a(h storyPinCreateData, String creationSessionId) {
        Intrinsics.checkNotNullParameter(storyPinCreateData, "storyPinCreateData");
        Intrinsics.checkNotNullParameter(creationSessionId, "creationSessionId");
        c0 c0Var = new c0(1);
        c0Var.j("BOARD_ID", storyPinCreateData.f23988b);
        c0Var.j("BOARD_NAME", storyPinCreateData.f23990d);
        Boolean bool = storyPinCreateData.f23991e;
        c0Var.g("IS_DRAFT", bool != null ? bool.booleanValue() : false);
        c0Var.g("COMMENTS_ENABLED", storyPinCreateData.f23996j);
        c0Var.j("IDEA_PIN_CREATION_SESSION_ID", creationSessionId);
        c0Var.j("IDEA_PIN_LOCAL_DRAFT_ID", storyPinCreateData.f23992f);
        c0Var.j("MEDIA_EXPORT_SKIPPED", storyPinCreateData.f24004r);
        c0Var.k("SOURCE_CLIP_DATA", (String[]) storyPinCreateData.f24005s.toArray(new String[0]));
        wn0 wn0Var = storyPinCreateData.f23987a;
        Integer templateType = wn0Var.getTemplateType();
        if (templateType != null) {
            c0Var.h(templateType.intValue(), "TEMPLATE_TYPE");
        }
        String str = storyPinCreateData.f23993g;
        if (str != null) {
            c0Var.j("ENTRY_TYPE", str);
        }
        String str2 = storyPinCreateData.f23994h;
        if (str2 != null) {
            c0Var.j("MEDIA_TYPE", str2);
        }
        String str3 = storyPinCreateData.f23995i;
        if (str3 != null) {
            c0Var.j("ALT_TEXT", str3);
        }
        String str4 = storyPinCreateData.f23989c;
        if (str4 != null) {
            c0Var.j("BOARD_SECTION_ID", str4);
        }
        String sponsorId = wn0Var.getSponsorId();
        if (sponsorId != null) {
            c0Var.j("SPONSOR_ID", sponsorId);
        }
        c0Var.g("ALLOW_SHOPPING_REC", wn0Var.getShopSimilarEnabled());
        String str5 = storyPinCreateData.f23997k;
        if (str5 != null) {
            c0Var.j("STORY_PIN_LINK", str5);
        }
        Integer num = storyPinCreateData.f23998l;
        if (num != null) {
            c0Var.h(num.intValue(), "SCHEDULED_TIME_SECONDS");
        }
        String str6 = storyPinCreateData.f23999m;
        if (str6 != null) {
            c0Var.j("FREE_FORM_TAGS", str6);
        }
        String str7 = storyPinCreateData.f24000n;
        if (str7 != null) {
            c0Var.j("PIN_INTEREST_IDS", str7);
        }
        String str8 = storyPinCreateData.f24001o;
        if (str8 != null) {
            c0Var.j("PIN_INTEREST_LABELS", str8);
        }
        String str9 = storyPinCreateData.f24002p;
        if (str9 != null) {
            c0Var.j("IDEA_PIN_DESCRIPTION", str9);
        }
        String str10 = storyPinCreateData.f24003q;
        if (str10 != null) {
            c0Var.j("IDEA_PIN_DESCRIPTION_USER_TAGS", str10);
        }
        return c0Var;
    }
}
