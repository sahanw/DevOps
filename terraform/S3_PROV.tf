resource "aws_s3_bucket_object" "file_upload" {
  bucket = "tfst"
  source = "terraform.tfstate"
  key    = "terraform.tfstate"
  etag = filemd5("terraform.tfstate")
}