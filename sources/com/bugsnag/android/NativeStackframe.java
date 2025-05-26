package com.bugsnag.android;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0004\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001Bg\b\u0000\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b5\u00106J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR$\u0010\"\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(\"\u0004\b)\u0010*R$\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00102\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\t\u001a\u0004\b3\u0010\u000b\"\u0004\b4\u0010\r¨\u00067"}, d2 = {"Lcom/bugsnag/android/NativeStackframe;", "Lcom/bugsnag/android/n1;", "Lcom/bugsnag/android/o1;", "writer", "", "toStream", "(Lcom/bugsnag/android/o1;)V", "", "method", "Ljava/lang/String;", "getMethod", "()Ljava/lang/String;", "setMethod", "(Ljava/lang/String;)V", "file", "getFile", "setFile", "", "lineNumber", "Ljava/lang/Number;", "getLineNumber", "()Ljava/lang/Number;", "setLineNumber", "(Ljava/lang/Number;)V", "", "frameAddress", "Ljava/lang/Long;", "getFrameAddress", "()Ljava/lang/Long;", "setFrameAddress", "(Ljava/lang/Long;)V", "symbolAddress", "getSymbolAddress", "setSymbolAddress", "loadAddress", "getLoadAddress", "setLoadAddress", "", "isPC", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setPC", "(Ljava/lang/Boolean;)V", "Lcom/bugsnag/android/ErrorType;", "type", "Lcom/bugsnag/android/ErrorType;", "getType", "()Lcom/bugsnag/android/ErrorType;", "setType", "(Lcom/bugsnag/android/ErrorType;)V", "codeIdentifier", "getCodeIdentifier", "setCodeIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lcom/bugsnag/android/ErrorType;Ljava/lang/String;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class NativeStackframe implements n1 {
    private String codeIdentifier;
    private String file;
    private Long frameAddress;
    private Boolean isPC;
    private Number lineNumber;
    private Long loadAddress;
    private String method;
    private Long symbolAddress;
    private ErrorType type;

    public NativeStackframe(String str, String str2, Number number, Long l13, Long l14, Long l15, Boolean bool, ErrorType errorType, String str3) {
        this.method = str;
        this.file = str2;
        this.lineNumber = number;
        this.frameAddress = l13;
        this.symbolAddress = l14;
        this.loadAddress = l15;
        this.isPC = bool;
        this.type = errorType;
        this.codeIdentifier = str3;
    }

    public final String getCodeIdentifier() {
        return this.codeIdentifier;
    }

    public final String getFile() {
        return this.file;
    }

    public final Long getFrameAddress() {
        return this.frameAddress;
    }

    public final Number getLineNumber() {
        return this.lineNumber;
    }

    public final Long getLoadAddress() {
        return this.loadAddress;
    }

    public final String getMethod() {
        return this.method;
    }

    public final Long getSymbolAddress() {
        return this.symbolAddress;
    }

    public final ErrorType getType() {
        return this.type;
    }

    /* renamed from: isPC, reason: from getter */
    public final Boolean getIsPC() {
        return this.isPC;
    }

    public final void setCodeIdentifier(String str) {
        this.codeIdentifier = str;
    }

    public final void setFile(String str) {
        this.file = str;
    }

    public final void setFrameAddress(Long l13) {
        this.frameAddress = l13;
    }

    public final void setLineNumber(Number number) {
        this.lineNumber = number;
    }

    public final void setLoadAddress(Long l13) {
        this.loadAddress = l13;
    }

    public final void setMethod(String str) {
        this.method = str;
    }

    public final void setPC(Boolean bool) {
        this.isPC = bool;
    }

    public final void setSymbolAddress(Long l13) {
        this.symbolAddress = l13;
    }

    public final void setType(ErrorType errorType) {
        this.type = errorType;
    }

    @Override // com.bugsnag.android.n1
    public void toStream(@NotNull o1 writer) {
        writer.d();
        writer.K("method");
        writer.z(this.method);
        writer.K("file");
        writer.z(this.file);
        writer.K("lineNumber");
        writer.w(this.lineNumber);
        if (this.frameAddress != null) {
            writer.K("frameAddress");
            com.bugsnag.android.repackaged.dslplatform.json.k kVar = hd.l.f68841a;
            writer.z(hd.l.d(getFrameAddress()));
        }
        if (this.symbolAddress != null) {
            writer.K("symbolAddress");
            com.bugsnag.android.repackaged.dslplatform.json.k kVar2 = hd.l.f68841a;
            writer.z(hd.l.d(getSymbolAddress()));
        }
        if (this.loadAddress != null) {
            writer.K("loadAddress");
            com.bugsnag.android.repackaged.dslplatform.json.k kVar3 = hd.l.f68841a;
            writer.z(hd.l.d(getLoadAddress()));
        }
        writer.K("codeIdentifier");
        writer.z(this.codeIdentifier);
        writer.K("isPC");
        writer.q(this.isPC);
        ErrorType errorType = this.type;
        if (errorType != null) {
            writer.K("type");
            writer.z(errorType.getDesc());
        }
        writer.g();
    }

    public /* synthetic */ NativeStackframe(String str, String str2, Number number, Long l13, Long l14, Long l15, Boolean bool, ErrorType errorType, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, number, l13, l14, l15, bool, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : errorType, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : str3);
    }
}
