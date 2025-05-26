package ey;

import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60580a;

    public /* synthetic */ u(int i13) {
        this.f60580a = i13;
    }

    public static qz.e0 b(ByteArrayInputStream inputStream, String str) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        if (str == null) {
            str = "application/octet-stream";
        }
        return new qz.e0(inputStream, str);
    }

    public final void a(x92.b apiFieldsMap) {
        switch (this.f60580a) {
            case 15:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                pk.a0.b(apiFieldsMap);
                apiFieldsMap.e("repinactivity.pin()");
                apiFieldsMap.e("pin.board()");
                n60.o.w(apiFieldsMap, "board.id", "board.name", "board.url", "board.image_cover_url");
                n60.o.w(apiFieldsMap, "board.pin_count", "board.section_count", "pin.pinner()", "user.full_name");
                apiFieldsMap.e("user.image_medium_url");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                n00.i.f88778a.a(apiFieldsMap);
                kotlin.jvm.internal.r.f(apiFieldsMap);
                kh2.k3.s(apiFieldsMap);
                apiFieldsMap.e("board.type");
                apiFieldsMap.h("board.images", "90x90");
                apiFieldsMap.e("pin.image_medium_url");
                kh2.g3.r(apiFieldsMap);
                break;
            case 17:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                pk.a0.b(apiFieldsMap);
                apiFieldsMap.h("board.images", "90x90");
                apiFieldsMap.h("board.image_thumbnail_urls", "60x60");
                n60.o.A(apiFieldsMap, "board.cover_images", "60x60", "board.pin_thumbnail_urls", "board.has_custom_cover");
                n60.o.w(apiFieldsMap, "board.image_cover_url", "board.image_thumbnail_url", "board.is_collaborative", "board.collaborating_users()");
                n60.o.w(apiFieldsMap, "board.privacy", "board.owner()", "board.archived_by_me_at", "board.pin_count");
                break;
            case 18:
                n60.o.C(apiFieldsMap, "apiFieldsMap", "boardsectionnamerecommendation.name", "boardsectionnamerecommendation.id", "boardsectionnamerecommendation.type");
                apiFieldsMap.e("pin.type");
                apiFieldsMap.h("pin.images", "236x");
                apiFieldsMap.e("boardsectionnamerecommendation.cover_images[236x]");
                break;
            case 19:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                kh2.g3.p(apiFieldsMap);
                apiFieldsMap.h("pin.images", "236x");
                n60.o.w(apiFieldsMap, "board.owner()", "board.image_cover_hd_url", "pin.section()", "board.is_collaborative");
                n60.o.w(apiFieldsMap, "board.collaborator_permissions", "board.collaborator_permissions_setting", "pin.is_ghost", "pin.native_creator()");
                n60.o.w(apiFieldsMap, "pin.unified_user_note", "board.is_eligible_for_seasonal_share_treatment", "pin.is_call_to_create", "pin.call_to_create_responses_count");
                apiFieldsMap.e("pin.pin_note()");
                n00.p.f88786a.a(apiFieldsMap);
                apiFieldsMap.e("pin.favorited_by_me");
                apiFieldsMap.e("pin.favorite_user_count");
                apiFieldsMap.e("storypindata.is_deleted");
                apiFieldsMap.e("pin.pinned_to_board");
                apiFieldsMap.e("board.is_featured_for_active_campaign");
                xk2.v vVar = n00.v.f88794a;
                bz.h.e(apiFieldsMap);
                break;
            case 20:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                kh2.n3.i(apiFieldsMap);
                apiFieldsMap.e("board.allow_homefeed_recommendations");
                apiFieldsMap.e("board.pin_count");
                apiFieldsMap.e("board.board_order_modified_at");
                apiFieldsMap.e("user.image_small_url");
                break;
            case 21:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                n00.d.f88768a.b(apiFieldsMap);
                apiFieldsMap.e("pin.is_blocked");
                apiFieldsMap.e("pin.is_disabled_by_dsa");
                apiFieldsMap.e("pin.activity_timestamp");
                break;
            case 22:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                kh2.n3.i(apiFieldsMap);
                apiFieldsMap.e("board.is_eligible_for_homefeed_tabs");
                apiFieldsMap.e("board.should_show_more_ideas");
                break;
            case 23:
                n60.o.C(apiFieldsMap, "apiFieldsMap", "ideascardfeedmetadata.caption", "ideascardfeedmetadata.feed_type", "ideascardfeedmetadata.feed_title");
                n60.o.w(apiFieldsMap, "ideascardfeedmetadata.feed_subtitle", "ideascardfeedmetadata.board()", "ideascardfeedmetadata.section()", "ideascardfeedmetadata.interest()");
                n60.o.w(apiFieldsMap, "board.id", "board.name", "board.image_cover_url", "boardsection.id");
                n60.o.v(apiFieldsMap, "boardsection.title", "interest.id", "interest.name");
                break;
            case 24:
                n60.o.C(apiFieldsMap, "apiFieldsMap", "pinnote.id", "pinnote.type", "pinnote.text");
                apiFieldsMap.e("pinnote.created_at");
                apiFieldsMap.e("pinnote.updated_at");
                break;
            case 25:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                kh2.g3.p(apiFieldsMap);
                apiFieldsMap.e("storypindata.is_deleted");
                apiFieldsMap.e("pin.favorited_by_me");
                apiFieldsMap.e("pin.favorite_user_count");
                apiFieldsMap.e("pin.pinned_to_board");
                xk2.v vVar2 = n00.v.f88794a;
                Intrinsics.checkNotNullParameter(apiFieldsMap, "<this>");
                bz.h.d(apiFieldsMap);
                bz.h.g(apiFieldsMap);
                break;
            case 26:
                n60.o.C(apiFieldsMap, "apiFieldsMap", "profilehighlight.id", "profilehighlight.type", "profilehighlight.title");
                n60.o.w(apiFieldsMap, "profilehighlight.cover_image", "profilehighlight.highlight_item_count", "profilehighlight.dominant_color", "profilehighlight.created_at");
                apiFieldsMap.e("profilehighlight.updated_at");
                break;
            case 27:
                Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
                kh2.r.m(apiFieldsMap, false);
                apiFieldsMap.e("pin.rich_metadata()");
                apiFieldsMap.e("pin.rich_summary()");
                apiFieldsMap.h("pin.images", "136x136");
                apiFieldsMap.e("pintag.pins()");
                n60.o.w(apiFieldsMap, "pintag.x_percent", "pintag.y_percent", "pin.image_signature", "pin.is_eligible_for_pdp");
                break;
            case 28:
                n60.o.C(apiFieldsMap, "apiFieldsMap", "audio.id", "audio.type", "audio.provider_recording_id");
                n60.o.w(apiFieldsMap, "audio.title", "audio.description", "audio.artist_name", "audio.audio_url");
                apiFieldsMap.e("audio.duration");
                apiFieldsMap.e("audio.thumbnail_image_url");
                break;
            default:
                n60.o.C(apiFieldsMap, "apiFieldsMap", "audiotag.id", "audiotag.name", "audiotag.thumbnail_image_url");
                apiFieldsMap.e("audiotag.tag_type");
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i13, int i14) {
        this(0);
        this.f60580a = i13;
        switch (i13) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
            default:
                break;
        }
    }
}
