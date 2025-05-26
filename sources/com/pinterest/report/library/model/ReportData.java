package com.pinterest.report.library.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/report/library/model/ReportData;", "Landroid/os/Parcelable;", "BoardReportData", "ConversationReportData", "LinkReportData", "PinReportData", "UserReportData", "Lcom/pinterest/report/library/model/ReportData$BoardReportData;", "Lcom/pinterest/report/library/model/ReportData$ConversationReportData;", "Lcom/pinterest/report/library/model/ReportData$LinkReportData;", "Lcom/pinterest/report/library/model/ReportData$PinReportData;", "Lcom/pinterest/report/library/model/ReportData$UserReportData;", "reportFlowLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class ReportData implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final String f50384a;

    /* renamed from: b, reason: collision with root package name */
    public final String f50385b;

    /* renamed from: c, reason: collision with root package name */
    public final String f50386c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/report/library/model/ReportData$BoardReportData;", "Lcom/pinterest/report/library/model/ReportData;", "CREATOR", "com/pinterest/report/library/model/a", "reportFlowLibrary_release"}, k = 1, mv = {1, 9, 0})
    public static final class BoardReportData extends ReportData {

        @NotNull
        public static final a CREATOR = new a();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BoardReportData(String boardId, String viewType, String str) {
            super(boardId, viewType, str);
            Intrinsics.checkNotNullParameter(boardId, "boardId");
            Intrinsics.checkNotNullParameter(viewType, "viewType");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/report/library/model/ReportData$ConversationReportData;", "Lcom/pinterest/report/library/model/ReportData;", "CREATOR", "com/pinterest/report/library/model/b", "reportFlowLibrary_release"}, k = 1, mv = {1, 9, 0})
    public static final class ConversationReportData extends ReportData {

        @NotNull
        public static final b CREATOR = new b();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationReportData(String conversationId, String viewType, String str) {
            super(conversationId, viewType, str);
            Intrinsics.checkNotNullParameter(conversationId, "conversationId");
            Intrinsics.checkNotNullParameter(viewType, "viewType");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/report/library/model/ReportData$LinkReportData;", "Lcom/pinterest/report/library/model/ReportData;", "CREATOR", "com/pinterest/report/library/model/c", "reportFlowLibrary_release"}, k = 1, mv = {1, 9, 0})
    public static final class LinkReportData extends ReportData {

        @NotNull
        public static final c CREATOR = new c();

        /* renamed from: d, reason: collision with root package name */
        public final String f50387d;

        /* renamed from: e, reason: collision with root package name */
        public final String f50388e;

        public /* synthetic */ LinkReportData(String str, String str2, String str3, String str4) {
            this(str, str2, str3, "IAB_OVERFLOW_MENU", str4);
        }

        @Override // com.pinterest.report.library.model.ReportData, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            super.writeToParcel(parcel, i13);
            parcel.writeString(this.f50387d);
            parcel.writeString(this.f50388e);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkReportData(String pinId, String viewType, String viewParameterType, String source, String str) {
            super(pinId, viewType, viewParameterType);
            Intrinsics.checkNotNullParameter(pinId, "pinId");
            Intrinsics.checkNotNullParameter(viewType, "viewType");
            Intrinsics.checkNotNullParameter(viewParameterType, "viewParameterType");
            Intrinsics.checkNotNullParameter(source, "source");
            this.f50387d = source;
            this.f50388e = str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/report/library/model/ReportData$PinReportData;", "Lcom/pinterest/report/library/model/ReportData;", "CREATOR", "com/pinterest/report/library/model/d", "reportFlowLibrary_release"}, k = 1, mv = {1, 9, 0})
    public static final class PinReportData extends ReportData {

        @NotNull
        public static final d CREATOR = new d();

        /* renamed from: d, reason: collision with root package name */
        public final String f50389d;

        /* renamed from: e, reason: collision with root package name */
        public final String f50390e;

        /* renamed from: f, reason: collision with root package name */
        public final String f50391f;

        /* renamed from: g, reason: collision with root package name */
        public final String f50392g;

        /* renamed from: h, reason: collision with root package name */
        public final String f50393h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f50394i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PinReportData(String pinId, String viewType, String str, String creatorId, String str2, String str3, String str4, String str5, boolean z13) {
            super(pinId, viewType, str);
            Intrinsics.checkNotNullParameter(pinId, "pinId");
            Intrinsics.checkNotNullParameter(viewType, "viewType");
            Intrinsics.checkNotNullParameter(creatorId, "creatorId");
            this.f50389d = creatorId;
            this.f50390e = str2;
            this.f50391f = str3;
            this.f50392g = str4;
            this.f50393h = str5;
            this.f50394i = z13;
        }

        @Override // com.pinterest.report.library.model.ReportData, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            super.writeToParcel(parcel, i13);
            parcel.writeString(this.f50389d);
            parcel.writeString(this.f50390e);
            parcel.writeString(this.f50391f);
            parcel.writeString(this.f50392g);
            parcel.writeString(this.f50393h);
            parcel.writeString(String.valueOf(this.f50394i));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/report/library/model/ReportData$UserReportData;", "Lcom/pinterest/report/library/model/ReportData;", "CREATOR", "com/pinterest/report/library/model/e", "reportFlowLibrary_release"}, k = 1, mv = {1, 9, 0})
    public static final class UserReportData extends ReportData {

        @NotNull
        public static final e CREATOR = new e();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserReportData(String userId, String viewType, String str) {
            super(userId, viewType, str);
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(viewType, "viewType");
        }
    }

    public ReportData(String str, String str2, String str3) {
        this.f50384a = str;
        this.f50385b = str2;
        this.f50386c = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getF50386c() {
        return this.f50386c;
    }

    /* renamed from: b, reason: from getter */
    public final String getF50385b() {
        return this.f50385b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f50384a);
        parcel.writeString(this.f50385b);
        parcel.writeString(this.f50386c);
    }
}
