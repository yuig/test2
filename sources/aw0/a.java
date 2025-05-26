package aw0;

import com.pinterest.feature.ideaPinCreation.worker.CreateStoryPinWorker;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20541i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CreateStoryPinWorker f20542j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(CreateStoryPinWorker createStoryPinWorker, int i13) {
        super(0);
        this.f20541i = i13;
        this.f20542j = createStoryPinWorker;
    }

    public final Integer b() {
        int i13 = this.f20541i;
        CreateStoryPinWorker createStoryPinWorker = this.f20542j;
        switch (i13) {
            case 22:
                int[] e13 = createStoryPinWorker.f78963b.f19998b.e("SCHEDULED_TIME_SECONDS");
                if (e13 != null) {
                    return c0.I(e13, 0);
                }
                return null;
            default:
                int[] e14 = createStoryPinWorker.f78963b.f19998b.e("TEMPLATE_TYPE");
                if (e14 != null) {
                    return c0.I(e14, 0);
                }
                return null;
        }
    }

    public final String e() {
        String str;
        String str2;
        String str3;
        int i13 = this.f20541i;
        CreateStoryPinWorker createStoryPinWorker = this.f20542j;
        switch (i13) {
            case 1:
                String[] i14 = createStoryPinWorker.f78963b.f19998b.i("ALT_TEXT");
                if (i14 != null) {
                    return (String) c0.J(0, i14);
                }
                return null;
            case 2:
                String[] i15 = createStoryPinWorker.f78963b.f19998b.i("BOARD_ID");
                return (i15 == null || (str = (String) c0.J(0, i15)) == null) ? "" : str;
            case 3:
                String[] i16 = createStoryPinWorker.f78963b.f19998b.i("BOARD_SECTION_ID");
                String str4 = i16 != null ? (String) c0.J(0, i16) : null;
                if (str4 == null || str4.length() != 0) {
                    return str4;
                }
                return null;
            case 4:
            case 11:
            case 12:
            case 15:
            default:
                String[] i17 = createStoryPinWorker.f78963b.f19998b.i("SPONSOR_ID");
                if (i17 != null) {
                    return (String) c0.J(0, i17);
                }
                return null;
            case 5:
                String[] i18 = createStoryPinWorker.f78963b.f19998b.i("IDEA_PIN_LOCAL_DRAFT_ID");
                return (i18 == null || (str2 = (String) c0.C(i18)) == null) ? "" : str2;
            case 6:
                String[] i19 = createStoryPinWorker.f78963b.f19998b.i("IDEA_PIN_CREATION_SESSION_ID");
                return (i19 == null || (str3 = (String) c0.C(i19)) == null) ? "" : str3;
            case 7:
                String[] i23 = createStoryPinWorker.f78963b.f19998b.i("IDEA_PIN_DESCRIPTION");
                if (i23 != null) {
                    return (String) c0.J(0, i23);
                }
                return null;
            case 8:
                String[] i24 = createStoryPinWorker.f78963b.f19998b.i("IDEA_PIN_DESCRIPTION_USER_TAGS");
                if (i24 != null) {
                    return (String) c0.J(0, i24);
                }
                return null;
            case 9:
                String[] i25 = createStoryPinWorker.f78963b.f19998b.i("ENTRY_TYPE");
                if (i25 != null) {
                    return (String) c0.J(0, i25);
                }
                return null;
            case 10:
                String[] i26 = createStoryPinWorker.f78963b.f19998b.i("FREE_FORM_TAGS");
                if (i26 != null) {
                    return (String) c0.J(0, i26);
                }
                return null;
            case 13:
                String[] i27 = createStoryPinWorker.f78963b.f19998b.i("PIN_INTEREST_IDS");
                if (i27 != null) {
                    return (String) c0.J(0, i27);
                }
                return null;
            case 14:
                String[] i28 = createStoryPinWorker.f78963b.f19998b.i("PIN_INTEREST_LABELS");
                if (i28 != null) {
                    return (String) c0.J(0, i28);
                }
                return null;
            case 16:
                String[] i29 = createStoryPinWorker.f78963b.f19998b.i("STORY_PIN_LINK");
                if (i29 != null) {
                    return (String) c0.J(0, i29);
                }
                return null;
            case 17:
                String[] i33 = createStoryPinWorker.f78963b.f19998b.i("MEDIA_EXPORT_SKIPPED");
                if (i33 != null) {
                    return (String) c0.J(0, i33);
                }
                return null;
            case 18:
                String[] i34 = createStoryPinWorker.f78963b.f19998b.i("MEDIA_TYPE");
                if (i34 != null) {
                    return (String) c0.J(0, i34);
                }
                return null;
        }
    }

    public final String[] f() {
        int i13 = this.f20541i;
        CreateStoryPinWorker createStoryPinWorker = this.f20542j;
        switch (i13) {
            case 11:
                String[] i14 = createStoryPinWorker.f78963b.f19998b.i("STORY_PIN_IMAGE_KEY_AND_IMAGE_SIGNATURE");
                return i14 == null ? new String[0] : i14;
            case 12:
                String[] i15 = createStoryPinWorker.f78963b.f19998b.i("STORY_PIN_VIDEO_KEY_AND_VIDEO_SIGNATURE");
                return i15 == null ? new String[0] : i15;
            case 21:
                String[] i16 = createStoryPinWorker.f78963b.f19998b.i("STORY_PIN_PAGE_ID_AND_TRACKING_ID");
                return i16 == null ? new String[0] : i16;
            default:
                return createStoryPinWorker.f78963b.f19998b.i("SOURCE_CLIP_DATA");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Boolean G;
        Boolean G2;
        Boolean G3;
        int i13 = this.f20541i;
        boolean z13 = false;
        CreateStoryPinWorker createStoryPinWorker = this.f20542j;
        switch (i13) {
            case 0:
                boolean[] c13 = createStoryPinWorker.f78963b.f19998b.c("ALLOW_SHOPPING_REC");
                if (c13 != null && (G = c0.G(c13)) != null) {
                    z13 = G.booleanValue();
                }
                return Boolean.valueOf(z13);
            case 4:
                boolean[] c14 = createStoryPinWorker.f78963b.f19998b.c("COMMENTS_ENABLED");
                if (c14 != null && (G2 = c0.G(c14)) != null) {
                    z13 = G2.booleanValue();
                }
                return Boolean.valueOf(z13);
            default:
                boolean[] c15 = createStoryPinWorker.f78963b.f19998b.c("IS_DRAFT");
                if (c15 != null && (G3 = c0.G(c15)) != null) {
                    z13 = G3.booleanValue();
                }
                return Boolean.valueOf(z13);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f20541i;
        CreateStoryPinWorker createStoryPinWorker = this.f20542j;
        switch (i13) {
            case 0:
                return invoke();
            case 1:
                return e();
            case 2:
                return e();
            case 3:
                return e();
            case 4:
                return invoke();
            case 5:
                return e();
            case 6:
                return e();
            case 7:
                return e();
            case 8:
                return e();
            case 9:
                return e();
            case 10:
                return e();
            case 11:
                return f();
            case 12:
                return f();
            case 13:
                return e();
            case 14:
                return e();
            case 15:
                return invoke();
            case 16:
                return e();
            case 17:
                return e();
            case 18:
                return e();
            case 19:
                return createStoryPinWorker.f46614n.f15131d;
            case 20:
                return createStoryPinWorker.f46614n.f15133f;
            case 21:
                return f();
            case 22:
                return b();
            case 23:
                return f();
            case 24:
                return e();
            case 25:
                return b();
            default:
                return createStoryPinWorker.f46614n.f15134g;
        }
    }
}
