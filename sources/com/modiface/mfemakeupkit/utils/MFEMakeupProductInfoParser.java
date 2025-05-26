package com.modiface.mfemakeupkit.utils;

import androidx.annotation.NonNull;
import com.modiface.mfemakeupkit.effects.MFEMakeupLook;
import com.modiface.mfemakeupkit.effects.MFEMakeupProductInfo;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;

/* loaded from: classes7.dex */
public class MFEMakeupProductInfoParser {

    public enum ErrorCode {
        DataFormat("Invalid data format"),
        VersionMismatch("Incompatible data version");

        String message;

        ErrorCode(String str) {
            this.message = str;
        }
    }

    public static class Result {
        public final ArrayList<MFEMakeupProductInfo> productInfoList;
        public final HashMap<String, MFEMakeupProductInfo> upcToProductInfoMap;

        public Result(ArrayList<MFEMakeupProductInfo> arrayList, HashMap<String, MFEMakeupProductInfo> hashMap) {
            this.productInfoList = arrayList;
            this.upcToProductInfoMap = hashMap;
        }
    }

    public static Result parse(String str) {
        return b.a(str);
    }

    public static MFEMakeupLook parseLookFromJSONArray(JSONArray jSONArray) {
        return b.a(jSONArray);
    }

    public static class ParserException extends Exception {
        public final ErrorCode errorCode;

        public ParserException(@NonNull ErrorCode errorCode, @NonNull String str) {
            super(constructMessage(errorCode, str));
            this.errorCode = errorCode;
        }

        private static String constructMessage(@NonNull ErrorCode errorCode, @NonNull String str) {
            return "Parser Error: " + errorCode.message + "(" + errorCode.name() + ")\n" + str;
        }

        public ParserException(@NonNull ErrorCode errorCode, @NonNull String str, Throwable th3) {
            super(constructMessage(errorCode, str), th3);
            this.errorCode = errorCode;
        }
    }
}
