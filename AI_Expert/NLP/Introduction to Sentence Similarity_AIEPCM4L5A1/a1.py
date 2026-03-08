# 1) Import libraries:
#    - requests (to call Hugging Face)
#    - HF_API_KEY from config (your secret key)

# 2) Set constants:
#    - MODEL_ID (sentence similarity model)
#    - API_URL (router endpoint)
#    - HEADERS (Authorization bearer token)
#    - PAIRS (some example question pairs)

# 3) Function: similarity(q1, q2)
#    - Build payload with:
#        {"inputs": {"source_sentence": q1, "sentences": [q2]}}
#    - Send POST request to Hugging Face
#    - If response fails, raise a friendly error
#    - Read JSON and return the single similarity score (0 to 1)

# 4) Function: bar(score01)
#    - Convert similarity score into a 10-block bar using █ and ░
#    - Return the bar string

# 5) Function: verdict(score01, threshold)
#    - If score >= threshold: return "DUPLICATE"
#    - Else: return "DIFFERENT"

# 6) Function: main()
#    - Print game title + rules (threshold)
#    - Loop forever:
#        - Ask mode: demo / custom / exit
#        - If demo:
#            - For a few PAIRS, call similarity()
#            - Print Q1, Q2, similarity %, bar, and verdict
#        - If custom:
#            - Ask user for two questions
#            - Call similarity() and print result
#        - If exit:
#            - Stop the program
#        - Else:
#            - Show “please type demo/custom/exit”

# 7) Run main() only when the file runs directly:
#    if __name__ == "__main__":
#        main()
