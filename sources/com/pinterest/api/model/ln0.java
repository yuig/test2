package com.pinterest.api.model;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010+\u001a\u00020'\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00109\u001a\u000205\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010=¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006R\u001c\u0010&\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010+\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\"\u0010*R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u001c\u00104\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00109\u001a\u0002058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b0\u00108R\u001c\u0010<\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00108R\u001c\u0010A\u001a\u0004\u0018\u00010=8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b>\u0010@¨\u0006D"}, d2 = {"Lcom/pinterest/api/model/ln0;", "Ldl1/s;", "", "a", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "id", "Lcom/pinterest/api/model/wn0;", "b", "Lcom/pinterest/api/model/wn0;", "u", "()Lcom/pinterest/api/model/wn0;", "metadata", "Lcom/pinterest/api/model/tp;", "c", "Lcom/pinterest/api/model/tp;", "x", "()Lcom/pinterest/api/model/tp;", "pageData", "", "Lcom/pinterest/api/model/m40;", "d", "Ljava/util/List;", "A", "()Ljava/util/List;", "tags", "e", "altText", "f", "boardId", "g", "boardSectionId", "Lou1/c;", "h", "Lou1/c;", "getCommentReplyData", "()Lou1/c;", "commentReplyData", "", "i", "Z", "()Z", "commentsEnabled", "j", "v", "mostRecentTextStyleBlockId", "Lcom/pinterest/api/model/qp;", "k", "Lcom/pinterest/api/model/qp;", "s", "()Lcom/pinterest/api/model/qp;", "link", "Ljava/util/Date;", "l", "Ljava/util/Date;", "()Ljava/util/Date;", "createdAt", "m", "z", "scheduledDate", "", "n", "[B", "()[B", "extractedImageMetadata", "<init>", "(Ljava/lang/String;Lcom/pinterest/api/model/wn0;Lcom/pinterest/api/model/tp;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lou1/c;ZLjava/lang/String;Lcom/pinterest/api/model/qp;Ljava/util/Date;Ljava/util/Date;[B)V", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class ln0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("id")
    @NotNull
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("metadata")
    @NotNull
    private final wn0 metadata;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("pageData")
    private final tp pageData;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("tags")
    @NotNull
    private final List<m40> tags;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("altText")
    private final String altText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("boardId")
    private final String boardId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("boardSectionId")
    private final String boardSectionId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @om.b("commentReplyData")
    private final ou1.c commentReplyData;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @om.b("commentsEnabled")
    private final boolean commentsEnabled;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @om.b("textStyleBlockId")
    private final String mostRecentTextStyleBlockId;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @om.b("link")
    private final qp link;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @om.b("createdAt")
    @NotNull
    private final Date createdAt;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @om.b("scheduled_date")
    private final Date scheduledDate;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @om.b("extracted_image_metadata")
    private final byte[] extractedImageMetadata;

    /* JADX WARN: Multi-variable type inference failed */
    public ln0(@NotNull String id3, @NotNull wn0 metadata, tp tpVar, @NotNull List<? extends m40> tags, String str, String str2, String str3, ou1.c cVar, boolean z13, String str4, qp qpVar, @NotNull Date createdAt, Date date, byte[] bArr) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.id = id3;
        this.metadata = metadata;
        this.pageData = tpVar;
        this.tags = tags;
        this.altText = str;
        this.boardId = str2;
        this.boardSectionId = str3;
        this.commentsEnabled = z13;
        this.mostRecentTextStyleBlockId = str4;
        this.link = qpVar;
        this.createdAt = createdAt;
        this.scheduledDate = date;
        this.extractedImageMetadata = bArr;
    }

    public static ln0 a(ln0 ln0Var, wn0 wn0Var, tp tpVar, List list, String str, String str2, String str3, boolean z13, String str4, qp qpVar, Date date, byte[] bArr, int i13) {
        String id3 = ln0Var.id;
        wn0 metadata = (i13 & 2) != 0 ? ln0Var.metadata : wn0Var;
        tp tpVar2 = (i13 & 4) != 0 ? ln0Var.pageData : tpVar;
        List tags = (i13 & 8) != 0 ? ln0Var.tags : list;
        String str5 = (i13 & 16) != 0 ? ln0Var.altText : str;
        String str6 = (i13 & 32) != 0 ? ln0Var.boardId : str2;
        String str7 = (i13 & 64) != 0 ? ln0Var.boardSectionId : str3;
        ln0Var.getClass();
        boolean z14 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ln0Var.commentsEnabled : z13;
        String str8 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ln0Var.mostRecentTextStyleBlockId : str4;
        qp qpVar2 = (i13 & 1024) != 0 ? ln0Var.link : qpVar;
        Date createdAt = ln0Var.createdAt;
        Date date2 = (i13 & 4096) != 0 ? ln0Var.scheduledDate : date;
        byte[] bArr2 = (i13 & 8192) != 0 ? ln0Var.extractedImageMetadata : bArr;
        ln0Var.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new ln0(id3, metadata, tpVar2, tags, str5, str6, str7, null, z14, str8, qpVar2, createdAt, date2, bArr2);
    }

    /* renamed from: A, reason: from getter */
    public final List getTags() {
        return this.tags;
    }

    public final int B() {
        tp tpVar = this.pageData;
        if (tpVar != null) {
            return tpVar.j();
        }
        return 0;
    }

    public final int C() {
        tp tpVar = this.pageData;
        if (tpVar != null) {
            return tpVar.E();
        }
        return 0;
    }

    public final List D() {
        List overlayBlocks;
        tp tpVar = this.pageData;
        if (tpVar == null || (overlayBlocks = tpVar.getOverlayBlocks()) == null) {
            return kotlin.collections.q0.f80391a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : overlayBlocks) {
            if (obj instanceof mq) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final int E() {
        tp tpVar = this.pageData;
        if (tpVar != null) {
            return tpVar.H();
        }
        return 0;
    }

    public final int F() {
        tp tpVar = this.pageData;
        if (tpVar != null) {
            return tpVar.J();
        }
        return 0;
    }

    public final boolean G() {
        return this.pageData != null;
    }

    public final boolean H() {
        tp tpVar = this.pageData;
        if (tpVar != null) {
            return tpVar.a();
        }
        return false;
    }

    public final ln0 I(Function1 update) {
        Intrinsics.checkNotNullParameter(update, "update");
        return a(this, null, (tp) update.invoke(y()), null, null, null, null, false, null, null, null, null, 16379);
    }

    public final ln0 J(tp page, boolean z13) {
        Intrinsics.checkNotNullParameter(page, "page");
        return a(this, null, page.q(z13, true), null, null, null, null, false, null, null, null, null, 16379);
    }

    @Override // dl1.s
    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    /* renamed from: e, reason: from getter */
    public final String getBoardId() {
        return this.boardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(ln0.class, obj.getClass())) {
            return false;
        }
        ln0 ln0Var = (ln0) obj;
        return Intrinsics.d(this.metadata, ln0Var.metadata) && Intrinsics.d(this.pageData, ln0Var.pageData) && Intrinsics.d(this.tags, ln0Var.tags) && Intrinsics.d(this.boardId, ln0Var.boardId) && Intrinsics.d(this.boardSectionId, ln0Var.boardSectionId) && this.commentsEnabled == ln0Var.commentsEnabled && Intrinsics.d(this.link, ln0Var.link) && Intrinsics.d(this.scheduledDate, ln0Var.scheduledDate);
    }

    /* renamed from: g, reason: from getter */
    public final String getBoardSectionId() {
        return this.boardSectionId;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getCommentsEnabled() {
        return this.commentsEnabled;
    }

    public final int hashCode() {
        int hashCode = (this.metadata.hashCode() + (this.id.hashCode() * 31)) * 31;
        tp tpVar = this.pageData;
        int c13 = ep.b.c(this.tags, (hashCode + (tpVar == null ? 0 : tpVar.hashCode())) * 31, 31);
        String str = this.altText;
        int hashCode2 = (c13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.boardId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.boardSectionId;
        int e13 = ep.b.e(this.commentsEnabled, (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 961, 31);
        String str4 = this.mostRecentTextStyleBlockId;
        int hashCode4 = (e13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        qp qpVar = this.link;
        int hashCode5 = (this.createdAt.hashCode() + ((hashCode4 + (qpVar == null ? 0 : qpVar.hashCode())) * 31)) * 31;
        Date date = this.scheduledDate;
        int hashCode6 = (hashCode5 + (date == null ? 0 : date.hashCode())) * 31;
        byte[] bArr = this.extractedImageMetadata;
        return hashCode6 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public final String j() {
        tp tpVar = this.pageData;
        if (tpVar != null) {
            return tpVar.getLocalAdjustedImagePath();
        }
        return null;
    }

    /* renamed from: k, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final long l() {
        tp tpVar;
        if (H() || (tpVar = this.pageData) == null) {
            return 0L;
        }
        return tpVar.v();
    }

    /* renamed from: n, reason: from getter */
    public final byte[] getExtractedImageMetadata() {
        return this.extractedImageMetadata;
    }

    public final String q() {
        return this.id;
    }

    /* renamed from: s, reason: from getter */
    public final qp getLink() {
        return this.link;
    }

    public final String toString() {
        String str = this.id;
        wn0 wn0Var = this.metadata;
        tp tpVar = this.pageData;
        List<m40> list = this.tags;
        String str2 = this.altText;
        String str3 = this.boardId;
        String str4 = this.boardSectionId;
        boolean z13 = this.commentsEnabled;
        String str5 = this.mostRecentTextStyleBlockId;
        qp qpVar = this.link;
        Date date = this.createdAt;
        Date date2 = this.scheduledDate;
        String arrays = Arrays.toString(this.extractedImageMetadata);
        StringBuilder sb3 = new StringBuilder("StoryPinLocalData(id=");
        sb3.append(str);
        sb3.append(", metadata=");
        sb3.append(wn0Var);
        sb3.append(", pageData=");
        sb3.append(tpVar);
        sb3.append(", tags=");
        sb3.append(list);
        sb3.append(", altText=");
        a.a.B(sb3, str2, ", boardId=", str3, ", boardSectionId=");
        sb3.append(str4);
        sb3.append(", commentReplyData=null, commentsEnabled=");
        sb3.append(z13);
        sb3.append(", mostRecentTextStyleBlockId=");
        sb3.append(str5);
        sb3.append(", link=");
        sb3.append(qpVar);
        sb3.append(", createdAt=");
        sb3.append(date);
        sb3.append(", scheduledDate=");
        sb3.append(date2);
        sb3.append(", extractedImageMetadata=");
        return a.a.p(sb3, arrays, ")");
    }

    /* renamed from: u, reason: from getter */
    public final wn0 getMetadata() {
        return this.metadata;
    }

    /* renamed from: v, reason: from getter */
    public final String getMostRecentTextStyleBlockId() {
        return this.mostRecentTextStyleBlockId;
    }

    public final oq w() {
        tp tpVar;
        String str = this.mostRecentTextStyleBlockId;
        Object obj = null;
        if (str == null || (tpVar = this.pageData) == null) {
            return null;
        }
        Iterator it = tpVar.I().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.d(((oq) next).getConfig().getId(), str)) {
                obj = next;
                break;
            }
        }
        return (oq) obj;
    }

    /* renamed from: x, reason: from getter */
    public final tp getPageData() {
        return this.pageData;
    }

    public final tp y() {
        tp tpVar = this.pageData;
        if (tpVar != null) {
            return tpVar;
        }
        throw new NoSuchElementException("pageData is null.");
    }

    /* renamed from: z, reason: from getter */
    public final Date getScheduledDate() {
        return this.scheduledDate;
    }

    public ln0(String str, wn0 wn0Var, tp tpVar, List list, String str2, String str3, String str4, ou1.c cVar, boolean z13, String str5, qp qpVar, Date date, Date date2, byte[] bArr, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, wn0Var, tpVar, (i13 & 8) != 0 ? kotlin.collections.q0.f80391a : list, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? null : str3, (i13 & 64) != 0 ? null : str4, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : cVar, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : z13, (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : str5, (i13 & 1024) != 0 ? null : qpVar, (i13 & 2048) != 0 ? new Date() : date, (i13 & 4096) != 0 ? null : date2, (i13 & 8192) != 0 ? null : bArr);
    }
}
