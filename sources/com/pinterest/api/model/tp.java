package com.pinterest.api.model;

import android.graphics.Matrix;
import com.google.android.gms.ads.RequestConfiguration;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0017\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010(\u0012\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020.0\u001d\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u000107¢\u0006\u0004\b<\u0010=R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b&\u0010\u0006R\u001c\u0010-\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u00101\u001a\b\u0012\u0004\u0012\u00020.0\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b0\u0010\"R\u001c\u00106\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u001c\u0010;\u001a\u0004\u0018\u0001078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010:¨\u0006>"}, d2 = {"Lcom/pinterest/api/model/tp;", "Lcom/pinterest/api/model/wx;", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "pageBackgroundColor", "Lcom/pinterest/api/model/vn0;", "c", "Lcom/pinterest/api/model/vn0;", "D", "()Lcom/pinterest/api/model/vn0;", "mediaList", "Lcom/pinterest/api/model/sp;", "d", "Lcom/pinterest/api/model/sp;", "g", "()Lcom/pinterest/api/model/sp;", "audioList", "Lcom/pinterest/api/model/fo;", "e", "Lcom/pinterest/api/model/fo;", "h", "()Lcom/pinterest/api/model/fo;", "audioMix", "", "Lcom/pinterest/api/model/qq;", "f", "Ljava/util/List;", "F", "()Ljava/util/List;", "overlayBlocks", "x", "exportPath", "C", "localAdjustedImagePath", "Lcom/pinterest/api/model/to;", "i", "Lcom/pinterest/api/model/to;", "s", "()Lcom/pinterest/api/model/to;", "coverImageData", "Lcom/pinterest/api/model/mp;", "j", "u", "drawingPathList", "", "k", "Ljava/lang/Float;", "()Ljava/lang/Float;", "canvasYOffsetPercentage", "", "l", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "contentModified", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/pinterest/api/model/vn0;Lcom/pinterest/api/model/sp;Lcom/pinterest/api/model/fo;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/pinterest/api/model/to;Ljava/util/List;Ljava/lang/Float;Ljava/lang/Boolean;)V", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class tp extends wx {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("id")
    @NotNull
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("pageBackgroundColor")
    @NotNull
    private final String pageBackgroundColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("mediaList")
    @NotNull
    private final vn0 mediaList;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("audioList")
    @NotNull
    private final sp audioList;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("audioMix")
    @NotNull
    private final fo audioMix;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("overlayBlocks")
    @NotNull
    private final List<qq> overlayBlocks;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("exportPath")
    private final String exportPath;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @om.b("localAdjustedImagePath")
    private final String localAdjustedImagePath;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @om.b("coverImageData")
    private final to coverImageData;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @om.b("drawingPathList")
    @NotNull
    private final List<mp> drawingPathList;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @om.b("canvasYOffsetPercentage")
    private final Float canvasYOffsetPercentage;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @om.b("contentModified")
    private final Boolean contentModified;

    public tp(String str, String str2, vn0 vn0Var, sp spVar, fo foVar, List list, String str3, String str4, to toVar, List list2, Float f13, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, vn0Var, (i13 & 8) != 0 ? new sp(null, 1, 0 == true ? 1 : 0) : spVar, (i13 & 16) != 0 ? new fo(0.0f, 0.0f, 3, null) : foVar, (i13 & 32) != 0 ? kotlin.collections.q0.f80391a : list, (i13 & 64) != 0 ? null : str3, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str4, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : toVar, (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? kotlin.collections.q0.f80391a : list2, (i13 & 1024) != 0 ? null : f13, (i13 & 2048) != 0 ? Boolean.FALSE : bool);
    }

    public static tp e(tp tpVar, String str, String str2, vn0 vn0Var, sp spVar, fo foVar, List list, String str3, String str4, to toVar, List list2, Float f13, Boolean bool, int i13) {
        String id3 = (i13 & 1) != 0 ? tpVar.id : str;
        String pageBackgroundColor = (i13 & 2) != 0 ? tpVar.pageBackgroundColor : str2;
        vn0 mediaList = (i13 & 4) != 0 ? tpVar.mediaList : vn0Var;
        sp audioList = (i13 & 8) != 0 ? tpVar.audioList : spVar;
        fo audioMix = (i13 & 16) != 0 ? tpVar.audioMix : foVar;
        List overlayBlocks = (i13 & 32) != 0 ? tpVar.overlayBlocks : list;
        String str5 = (i13 & 64) != 0 ? tpVar.exportPath : str3;
        String str6 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? tpVar.localAdjustedImagePath : str4;
        to toVar2 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? tpVar.coverImageData : toVar;
        List drawingPathList = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? tpVar.drawingPathList : list2;
        Float f14 = (i13 & 1024) != 0 ? tpVar.canvasYOffsetPercentage : f13;
        Boolean bool2 = (i13 & 2048) != 0 ? tpVar.contentModified : bool;
        tpVar.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(pageBackgroundColor, "pageBackgroundColor");
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        Intrinsics.checkNotNullParameter(audioList, "audioList");
        Intrinsics.checkNotNullParameter(audioMix, "audioMix");
        Intrinsics.checkNotNullParameter(overlayBlocks, "overlayBlocks");
        Intrinsics.checkNotNullParameter(drawingPathList, "drawingPathList");
        return new tp(id3, pageBackgroundColor, mediaList, audioList, audioMix, overlayBlocks, str5, str6, toVar2, drawingPathList, f14, bool2);
    }

    public static /* synthetic */ tp h0(tp tpVar, String str, Function1 function1, Function1 function12, int i13) {
        if ((i13 & 2) != 0) {
            function1 = null;
        }
        if ((i13 & 4) != 0) {
            function12 = null;
        }
        return tpVar.f0(str, function1, function12);
    }

    public static /* synthetic */ Pair l0(tp tpVar, String str, Boolean bool, boolean z13, int i13) {
        if ((i13 & 4) != 0) {
            bool = null;
        }
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        return tpVar.j0(bool, str, z13);
    }

    public final d30 B() {
        bo0 bo0Var = (bo0) CollectionsKt.U(this.mediaList.getStartMediaIndex(), this.mediaList.getItems());
        if (bo0Var != null) {
            return bo0Var.getPhotoItem();
        }
        return null;
    }

    /* renamed from: C, reason: from getter */
    public final String getLocalAdjustedImagePath() {
        return this.localAdjustedImagePath;
    }

    /* renamed from: D, reason: from getter */
    public final vn0 getMediaList() {
        return this.mediaList;
    }

    public final int E() {
        List<qq> list = this.overlayBlocks;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof lq) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    /* renamed from: F, reason: from getter */
    public final List getOverlayBlocks() {
        return this.overlayBlocks;
    }

    /* renamed from: G, reason: from getter */
    public final String getPageBackgroundColor() {
        return this.pageBackgroundColor;
    }

    public final int H() {
        List<qq> list = this.overlayBlocks;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof mq) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    public final ArrayList I() {
        List<qq> list = this.overlayBlocks;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof oq) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final int J() {
        List<qq> list = this.overlayBlocks;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof pq) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    public final int K() {
        List<qq> list = this.overlayBlocks;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof mq) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((mq) obj2).getIsInvisible()) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2.size();
    }

    public final boolean N() {
        return !this.drawingPathList.isEmpty();
    }

    public final boolean P() {
        if ((!this.overlayBlocks.isEmpty()) || N()) {
            return true;
        }
        List items = this.mediaList.getItems();
        if (!(items instanceof Collection) || !items.isEmpty()) {
            Iterator it = items.iterator();
            while (it.hasNext()) {
                Matrix displayMatrix = ((bo0) it.next()).getDisplayMatrix();
                if (!(displayMatrix != null && displayMatrix.isIdentity())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean Q() {
        if (this.audioList.a() || !kotlin.collections.h1.f(5000L, 0L).contains(Long.valueOf(this.mediaList.v()))) {
            return true;
        }
        List<qq> list = this.overlayBlocks;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (qq qqVar : list) {
                if (qqVar.getDurationConfig().h()) {
                    return true;
                }
                if (!qqVar.getDurationConfig().i() && qqVar.getDurationConfig().f42275e != this.mediaList.v()) {
                    return true;
                }
                if (qqVar instanceof nq) {
                    Integer x13 = ((nq) qqVar).getStickerDetails().x();
                    if (x13.intValue() == a42.u.ANIMATED.getValue()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean R() {
        return this.mediaList.y() && !Q();
    }

    public final long T() {
        Iterator it = this.mediaList.getItems().iterator();
        long j13 = 0;
        while (it.hasNext()) {
            j13 += ((bo0) it.next()).f36143i;
        }
        return j13;
    }

    public final Pair V(zq stickerDetails) {
        Intrinsics.checkNotNullParameter(stickerDetails, "sticker");
        ArrayList H0 = CollectionsKt.H0(this.overlayBlocks);
        Intrinsics.checkNotNullParameter(stickerDetails, "stickerDetails");
        nq nqVar = new nq(kh2.a1.v(uq.STICKER), kh2.a1.u(), stickerDetails);
        H0.add(nqVar);
        return new Pair(e(this, null, null, null, null, null, H0, null, null, null, null, null, null, 4063), nqVar);
    }

    public final tp W() {
        return e(this, null, null, null, this.audioList.g(this.mediaList.v()), null, null, null, null, null, null, null, null, 4087);
    }

    public final Pair X(String boardId, v7 board) {
        int i13;
        jq g13;
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(board, "board");
        ArrayList H0 = CollectionsKt.H0(this.overlayBlocks);
        Iterator<qq> it = this.overlayBlocks.iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            qq next = it.next();
            if (Intrinsics.d(next.getConfig().getId(), null) && (next instanceof jq)) {
                i13 = i14;
                break;
            }
            i14++;
        }
        if (i13 == -1) {
            Intrinsics.checkNotNullParameter(boardId, "boardId");
            Intrinsics.checkNotNullParameter(board, "board");
            g13 = new jq(kh2.a1.v(uq.BOARD_STICKER), kh2.a1.u(), boardId, a42.c.DEFAULT, null, board, 16, null);
            H0.add(g13);
        } else {
            qq qqVar = this.overlayBlocks.get(i13);
            Intrinsics.g(qqVar, "null cannot be cast to non-null type com.pinterest.api.model.IdeaPinOverlayBlock.BoardStickerOverlayBlock");
            g13 = jq.g((jq) qqVar, null, null, boardId, null, null, board, 27);
            H0.set(i13, g13);
        }
        return new Pair(e(this, null, null, null, null, null, H0, null, null, null, null, null, null, 4063), g13);
    }

    public final Pair Y(String str, String str2, String str3, a42.c cVar, vq vqVar, v7 v7Var) {
        ArrayList H0 = CollectionsKt.H0(this.overlayBlocks);
        Iterator<qq> it = this.overlayBlocks.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            qq next = it.next();
            if (Intrinsics.d(next.getConfig().getId(), str) && (next instanceof jq)) {
                break;
            }
            i13++;
        }
        jq jqVar = null;
        if (i13 != -1) {
            qq qqVar = this.overlayBlocks.get(i13);
            Intrinsics.g(qqVar, "null cannot be cast to non-null type com.pinterest.api.model.IdeaPinOverlayBlock.BoardStickerOverlayBlock");
            jq jqVar2 = (jq) qqVar;
            jqVar = jq.g(jqVar2, rq.a(jqVar2.getConfig(), str2 == null ? jqVar2.getConfig().getColorHex() : str2, null, vqVar == null ? jqVar2.getConfig().getRotatedRect() : vqVar, 11), null, str3 == null ? jqVar2.getBoardId() : str3, cVar == null ? jqVar2.getVariantType() : cVar, null, v7Var == null ? jqVar2.getBoard() : v7Var, 18);
            H0.set(i13, jqVar);
        }
        return new Pair(e(this, null, null, null, null, null, H0, null, null, null, null, null, null, 4063), jqVar);
    }

    public final Pair Z(String str, d30 photoItem, Pair photoDimensions) {
        vq rotatedRect;
        kq g13;
        sw0.g0 rotationCalculator = sw0.g0.f115445a;
        Intrinsics.checkNotNullParameter(photoItem, "photoItem");
        Intrinsics.checkNotNullParameter(photoDimensions, "photoDimensions");
        Intrinsics.checkNotNullParameter(rotationCalculator, "rotationCalculator");
        ArrayList H0 = CollectionsKt.H0(this.overlayBlocks);
        Iterator<qq> it = this.overlayBlocks.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            qq next = it.next();
            if (Intrinsics.d(next.getConfig().getId(), str) && (next instanceof kq)) {
                break;
            }
            i13++;
        }
        if (i13 == -1) {
            Intrinsics.checkNotNullParameter(photoItem, "photoItem");
            g13 = new kq(kh2.a1.v(uq.IMAGE_STICKER), kh2.a1.u(), photoItem);
            H0.add(g13);
        } else {
            qq qqVar = this.overlayBlocks.get(i13);
            Intrinsics.g(qqVar, "null cannot be cast to non-null type com.pinterest.api.model.IdeaPinOverlayBlock.ImageStickerOverlayBlock");
            kq kqVar = (kq) qqVar;
            Matrix matrix = kqVar.getConfig().getMatrix();
            if (matrix == null || (rotatedRect = kqVar.getConfig().getRotatedRect()) == null) {
                g13 = kqVar;
            } else {
                float o13 = rotatedRect.o() / ((Number) photoDimensions.f80346a).intValue();
                float floatValue = ((Number) rotationCalculator.invoke(matrix)).floatValue();
                rq config = kqVar.getConfig();
                Matrix matrix2 = new Matrix();
                matrix2.postRotate(floatValue);
                matrix2.postScale(o13, o13);
                matrix2.postTranslate(rotatedRect.getTopLeft().x, rotatedRect.getTopLeft().y);
                Unit unit = Unit.f80348a;
                g13 = kq.g(kqVar, rq.a(config, null, matrix2, null, 7), null, photoItem, 2);
            }
            H0.set(i13, g13);
        }
        return new Pair(e(this, null, null, null, null, null, H0, null, null, null, null, null, null, 4063), g13);
    }

    public final boolean a() {
        return this.mediaList.y() && !Q();
    }

    @Override // dl1.s
    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final tp b0(int i13, Function1 update) {
        Intrinsics.checkNotNullParameter(update, "update");
        ArrayList H0 = CollectionsKt.H0(this.mediaList.getItems());
        bo0 bo0Var = (bo0) CollectionsKt.U(i13, this.mediaList.getItems());
        if (bo0Var != null) {
            H0.set(i13, update.invoke(bo0Var));
        }
        return e(this, null, null, vn0.a(this.mediaList, H0, 0, 0L, 0, 0L, 30), null, null, null, null, null, null, null, null, null, 4091);
    }

    public final Pair c0(String userId) {
        lq g13;
        Intrinsics.checkNotNullParameter(userId, "userId");
        ArrayList H0 = CollectionsKt.H0(this.overlayBlocks);
        Iterator<qq> it = this.overlayBlocks.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            qq next = it.next();
            if (Intrinsics.d(next.getConfig().getId(), null) && (next instanceof lq)) {
                break;
            }
            i13++;
        }
        if (i13 == -1) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            g13 = new lq(kh2.a1.v(uq.MENTION), kh2.a1.u(), userId);
            H0.add(g13);
        } else {
            qq qqVar = this.overlayBlocks.get(i13);
            Intrinsics.g(qqVar, "null cannot be cast to non-null type com.pinterest.api.model.IdeaPinOverlayBlock.MentionTagOverlayBlock");
            g13 = lq.g((lq) qqVar, null, null, userId, 3);
            H0.set(i13, g13);
        }
        return new Pair(e(this, null, null, null, null, null, H0, null, null, null, null, null, null, 4063), g13);
    }

    public final Pair e0(String overlayBlockId, String str, String str2) {
        Intrinsics.checkNotNullParameter(overlayBlockId, "overlayBlockId");
        ArrayList H0 = CollectionsKt.H0(this.overlayBlocks);
        Iterator<qq> it = this.overlayBlocks.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            qq next = it.next();
            if (Intrinsics.d(next.getConfig().getId(), overlayBlockId) && (next instanceof lq)) {
                break;
            }
            i13++;
        }
        lq lqVar = null;
        if (i13 != -1) {
            qq qqVar = this.overlayBlocks.get(i13);
            Intrinsics.g(qqVar, "null cannot be cast to non-null type com.pinterest.api.model.IdeaPinOverlayBlock.MentionTagOverlayBlock");
            lq lqVar2 = (lq) qqVar;
            lqVar = lq.g(lqVar2, rq.a(lqVar2.getConfig(), str == null ? lqVar2.getConfig().getColorHex() : str, null, null, 27), null, str2 == null ? lqVar2.getUserId() : str2, 2);
            H0.set(i13, lqVar);
        }
        return new Pair(e(this, null, null, null, null, null, H0, null, null, null, null, null, null, 4063), lqVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(tp.class, obj.getClass())) {
            return false;
        }
        tp tpVar = (tp) obj;
        return Intrinsics.d(this.pageBackgroundColor, tpVar.pageBackgroundColor) && Intrinsics.d(this.mediaList, tpVar.mediaList) && Intrinsics.d(this.audioList, tpVar.audioList) && Intrinsics.d(this.audioMix, tpVar.audioMix) && Intrinsics.d(this.drawingPathList, tpVar.drawingPathList) && Intrinsics.d(this.overlayBlocks, tpVar.overlayBlocks) && kotlin.text.z.i(this.localAdjustedImagePath, tpVar.localAdjustedImagePath, false);
    }

    public final tp f0(String overlayBlockId, Function1 function1, Function1 function12) {
        Intrinsics.checkNotNullParameter(overlayBlockId, "overlayBlockId");
        ArrayList H0 = CollectionsKt.H0(this.overlayBlocks);
        Iterator<qq> it = this.overlayBlocks.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (Intrinsics.d(it.next().getConfig().getId(), overlayBlockId)) {
                break;
            }
            i13++;
        }
        if (i13 != -1) {
            qq qqVar = this.overlayBlocks.get(i13);
            if (function1 != null) {
                qqVar = qqVar.e(function1);
            }
            if (function12 != null) {
                qqVar = qqVar.d(function12);
            }
            H0.set(i13, qqVar);
        }
        return e(this, null, null, null, null, null, H0, null, null, null, null, null, null, 4063);
    }

    /* renamed from: g, reason: from getter */
    public final sp getAudioList() {
        return this.audioList;
    }

    public final String getId() {
        return this.id;
    }

    /* renamed from: h, reason: from getter */
    public final fo getAudioMix() {
        return this.audioMix;
    }

    public final int hashCode() {
        int c13 = ep.b.c(this.overlayBlocks, (this.audioMix.hashCode() + ((this.audioList.hashCode() + ((this.mediaList.hashCode() + a.cb.d(this.pageBackgroundColor, this.id.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31);
        String str = this.exportPath;
        int hashCode = (c13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.localAdjustedImagePath;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        to toVar = this.coverImageData;
        int c14 = ep.b.c(this.drawingPathList, (hashCode2 + (toVar == null ? 0 : toVar.hashCode())) * 31, 31);
        Float f13 = this.canvasYOffsetPercentage;
        int hashCode3 = (c14 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Boolean bool = this.contentModified;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final int j() {
        List<qq> list = this.overlayBlocks;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof jq) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    public final Pair j0(Boolean bool, String pinId, boolean z13) {
        int i13;
        mq g13;
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        ArrayList H0 = CollectionsKt.H0(this.overlayBlocks);
        Iterator<qq> it = this.overlayBlocks.iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            qq next = it.next();
            if (Intrinsics.d(next.getConfig().getId(), null) && (next instanceof mq)) {
                i13 = i14;
                break;
            }
            i14++;
        }
        if (i13 == -1) {
            Intrinsics.checkNotNullParameter(pinId, "pinId");
            mq mqVar = new mq(kh2.a1.v(uq.PRODUCT_TAG), kh2.a1.u(), pinId, a42.o.TITLE, false, null, false, 96, null);
            if (bool != null) {
                mqVar = mq.g(mqVar, null, null, null, null, bool.booleanValue(), null, false, RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE);
            }
            g13 = mq.g(mqVar, null, null, null, null, false, null, z13, 63);
            H0.add(g13);
        } else {
            qq qqVar = this.overlayBlocks.get(i13);
            Intrinsics.g(qqVar, "null cannot be cast to non-null type com.pinterest.api.model.IdeaPinOverlayBlock.ProductTagOverlayBlock");
            mq g14 = mq.g((mq) qqVar, null, null, pinId, null, false, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
            if (bool != null) {
                g14 = mq.g(g14, null, null, null, null, bool.booleanValue(), null, false, RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE);
            }
            g13 = mq.g(g14, null, null, null, null, false, null, z13, 63);
            H0.set(i13, g13);
        }
        return new Pair(e(this, null, null, null, null, null, H0, null, null, null, null, null, null, 4063), g13);
    }

    /* renamed from: k, reason: from getter */
    public final Float getCanvasYOffsetPercentage() {
        return this.canvasYOffsetPercentage;
    }

    public final Pair k0(String str, String str2, String str3, a42.o oVar, vq vqVar) {
        ArrayList H0 = CollectionsKt.H0(this.overlayBlocks);
        Iterator<qq> it = this.overlayBlocks.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            qq next = it.next();
            if (Intrinsics.d(next.getConfig().getId(), str) && (next instanceof mq)) {
                break;
            }
            i13++;
        }
        mq mqVar = null;
        if (i13 != -1) {
            qq qqVar = this.overlayBlocks.get(i13);
            Intrinsics.g(qqVar, "null cannot be cast to non-null type com.pinterest.api.model.IdeaPinOverlayBlock.ProductTagOverlayBlock");
            mq mqVar2 = (mq) qqVar;
            mqVar = mq.g(mqVar2, rq.a(mqVar2.getConfig(), str2 == null ? mqVar2.getConfig().getColorHex() : str2, null, vqVar == null ? mqVar2.getConfig().getRotatedRect() : vqVar, 11), null, str3 == null ? mqVar2.getPinId() : str3, oVar == null ? mqVar2.getVariantType() : oVar, false, null, false, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER);
            H0.set(i13, mqVar);
        }
        return new Pair(e(this, null, null, null, null, null, H0, null, null, null, null, null, null, 4063), mqVar);
    }

    /* renamed from: l, reason: from getter */
    public final Boolean getContentModified() {
        return this.contentModified;
    }

    public final tp n() {
        Boolean bool = this.contentModified;
        return q(false, bool != null ? bool.booleanValue() : false);
    }

    public final Pair o0(String str, j1.v1 update, lq0.g1 g1Var) {
        oq oqVar;
        Intrinsics.checkNotNullParameter(update, "update");
        ArrayList H0 = CollectionsKt.H0(this.overlayBlocks);
        Iterator<qq> it = this.overlayBlocks.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (Intrinsics.d(it.next().getConfig().getId(), str)) {
                break;
            }
            i13++;
        }
        if (i13 == -1) {
            oqVar = (oq) ((oq) update.invoke(new oq(kh2.a1.v(uq.TEXT), kh2.a1.u(), "", "6", 36.0f, aq0.CENTER, er.NONE))).e(g1Var);
            H0.add(oqVar);
        } else {
            qq qqVar = this.overlayBlocks.get(i13);
            Intrinsics.g(qqVar, "null cannot be cast to non-null type com.pinterest.api.model.IdeaPinOverlayBlock.TextOverlayBlock");
            oqVar = (oq) ((oq) update.invoke((oq) qqVar)).e(g1Var);
            H0.set(i13, oqVar);
        }
        return new Pair(e(this, null, null, null, null, null, H0, null, null, null, null, null, null, 4063), oqVar);
    }

    public final Pair p0(String pinId) {
        pq g13;
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        ArrayList H0 = CollectionsKt.H0(this.overlayBlocks);
        Iterator<qq> it = this.overlayBlocks.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            qq next = it.next();
            if (Intrinsics.d(next.getConfig().getId(), null) && (next instanceof pq)) {
                break;
            }
            i13++;
        }
        if (i13 == -1) {
            Intrinsics.checkNotNullParameter(pinId, "pinId");
            g13 = new pq(kh2.a1.v(uq.VTO_PRODUCT_TAG), kh2.a1.u(), pinId);
            H0.add(g13);
        } else {
            qq qqVar = this.overlayBlocks.get(i13);
            Intrinsics.g(qqVar, "null cannot be cast to non-null type com.pinterest.api.model.IdeaPinOverlayBlock.VTOOverlayBlock");
            g13 = pq.g((pq) qqVar, null, null, pinId, 3);
            H0.set(i13, g13);
        }
        return new Pair(e(this, null, null, null, null, null, H0, null, null, null, null, null, null, 4063), g13);
    }

    public final tp q(boolean z13, boolean z14) {
        return e(this, a.cb.g("toString(...)"), null, null, null, null, null, null, z13 ? null : this.localAdjustedImagePath, null, null, null, Boolean.valueOf(z14), 1918);
    }

    /* renamed from: s, reason: from getter */
    public final to getCoverImageData() {
        return this.coverImageData;
    }

    public final Pair t0(String str, String str2, String str3) {
        ArrayList H0 = CollectionsKt.H0(this.overlayBlocks);
        Iterator<qq> it = this.overlayBlocks.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            qq next = it.next();
            if (Intrinsics.d(next.getConfig().getId(), str) && (next instanceof pq)) {
                break;
            }
            i13++;
        }
        pq pqVar = null;
        if (i13 != -1) {
            qq qqVar = this.overlayBlocks.get(i13);
            Intrinsics.g(qqVar, "null cannot be cast to non-null type com.pinterest.api.model.IdeaPinOverlayBlock.VTOOverlayBlock");
            pq pqVar2 = (pq) qqVar;
            pqVar = pq.g(pqVar2, rq.a(pqVar2.getConfig(), str2 == null ? pqVar2.getConfig().getColorHex() : str2, null, null, 27), null, str3 == null ? pqVar2.getPinId() : str3, 2);
            H0.set(i13, pqVar);
        }
        return new Pair(e(this, null, null, null, null, null, H0, null, null, null, null, null, null, 4063), pqVar);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.pageBackgroundColor;
        vn0 vn0Var = this.mediaList;
        sp spVar = this.audioList;
        fo foVar = this.audioMix;
        List<qq> list = this.overlayBlocks;
        String str3 = this.exportPath;
        String str4 = this.localAdjustedImagePath;
        to toVar = this.coverImageData;
        List<mp> list2 = this.drawingPathList;
        Float f13 = this.canvasYOffsetPercentage;
        Boolean bool = this.contentModified;
        StringBuilder w13 = a.a.w("IdeaPinLocalPage(id=", str, ", pageBackgroundColor=", str2, ", mediaList=");
        w13.append(vn0Var);
        w13.append(", audioList=");
        w13.append(spVar);
        w13.append(", audioMix=");
        w13.append(foVar);
        w13.append(", overlayBlocks=");
        w13.append(list);
        w13.append(", exportPath=");
        a.a.B(w13, str3, ", localAdjustedImagePath=", str4, ", coverImageData=");
        w13.append(toVar);
        w13.append(", drawingPathList=");
        w13.append(list2);
        w13.append(", canvasYOffsetPercentage=");
        w13.append(f13);
        w13.append(", contentModified=");
        w13.append(bool);
        w13.append(")");
        return w13.toString();
    }

    /* renamed from: u, reason: from getter */
    public final List getDrawingPathList() {
        return this.drawingPathList;
    }

    public final long v() {
        return this.mediaList.v();
    }

    /* renamed from: x, reason: from getter */
    public final String getExportPath() {
        return this.exportPath;
    }

    public final String y() {
        String e13;
        d30 B = B();
        if (B != null && (e13 = B.e()) != null) {
            return e13;
        }
        bo0 bo0Var = (bo0) CollectionsKt.U(this.mediaList.getStartMediaIndex(), this.mediaList.getItems());
        k01 videoItem = bo0Var != null ? bo0Var.getVideoItem() : null;
        if (videoItem != null) {
            return videoItem.e();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tp(@NotNull String id3, @NotNull String pageBackgroundColor, @NotNull vn0 mediaList, @NotNull sp audioList, @NotNull fo audioMix, @NotNull List<? extends qq> overlayBlocks, String str, String str2, to toVar, @NotNull List<mp> drawingPathList, Float f13, Boolean bool) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(pageBackgroundColor, "pageBackgroundColor");
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        Intrinsics.checkNotNullParameter(audioList, "audioList");
        Intrinsics.checkNotNullParameter(audioMix, "audioMix");
        Intrinsics.checkNotNullParameter(overlayBlocks, "overlayBlocks");
        Intrinsics.checkNotNullParameter(drawingPathList, "drawingPathList");
        this.id = id3;
        this.pageBackgroundColor = pageBackgroundColor;
        this.mediaList = mediaList;
        this.audioList = audioList;
        this.audioMix = audioMix;
        this.overlayBlocks = overlayBlocks;
        this.exportPath = str;
        this.localAdjustedImagePath = str2;
        this.coverImageData = toVar;
        this.drawingPathList = drawingPathList;
        this.canvasYOffsetPercentage = f13;
        this.contentModified = bool;
    }
}
